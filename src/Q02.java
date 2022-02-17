import java.util.Scanner;

public class Q02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        int min = 6;
        int missing = 0;

        if(!password.matches(".*[@|#|!|$|%|^|&|*|(|)|\\-|+].*")) {
            missing = missing + 1;
        }
        if(!password.matches(".*[0-9].*")){
            missing = missing + 1;
        }
        if(!password.matches(".*[A-Z].*")){
            missing = missing + 1;
        }
        if(!password.matches(".*[a-z].*")){
            missing = missing + 1;
        }
        if(password.length() < min) {
            missing = Math.max(min - password.length(), missing);
        }
        System.out.println(missing);
    }
}
