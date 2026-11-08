import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                String word = scanner.next();
                if (word.length() > 10) {
                    char primeraLetra = word.charAt(0);
                    char ultimaLetra = word.charAt(word.length() - 1);
                    int enMedio = word.length() - 2;
                    System.out.println("" + primeraLetra + enMedio + ultimaLetra);
                } else {
                    System.out.println(word);
                }
            }
        }
        scanner.close();
    }
}
