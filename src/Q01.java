import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("[^0-9]+");
        int n_linhas = scanner.nextInt();

        for(int linha = 1; linha <= n_linhas; linha++ ) {
            System.out.println(" ".repeat(n_linhas - linha).concat("*".repeat(linha)));
        }
    }
}
