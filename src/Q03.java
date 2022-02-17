import java.util.ArrayList;
import java.util.Scanner;

public class Q03 {
    private static int occurrences(String word, char c) {
        int count = 0;
        for (char readChar : word.toCharArray()) {
            if (readChar == c) {
                count++;
            }
        }
        return count;
    }

    private static int countAnagram(String wordA, String wordB) {
        ArrayList<Character> uniqueChars = new ArrayList<>();
        for (char c : wordA.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }
        for (char c : uniqueChars) {
            if (occurrences(wordA, c) != occurrences(wordB, c)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int maxLength = word.length() - 1;
        int anagramsFound = 0;
        for (int size = 1; size <= maxLength; size++) {
            for (int startPos = 0; startPos + size < word.length(); startPos++) {
                for (int search = startPos + 1; search + size <= word.length(); search++) {
                    String substringA = word.substring(startPos, startPos + size);
                    String substringB = word.substring(search, search + size);
                    anagramsFound += countAnagram(substringA, substringB);
                }
            }
        }
        System.out.println(anagramsFound);
    }
}
