import java.util.Scanner;

public class DeadPixel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt(); //Ancho
            int b = scanner.nextInt(); //Alto
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int areaMaxima = calcularAreaMaxima(a, b, x, y);

            System.out.println(areaMaxima);
        }
        scanner.close();
    }

    public static int calcularAreaMaxima(int a, int b, int x, int y) {
        int areaMaxima = 0;

        int areaDerecha = (x) * b;

        areaMaxima = Math.max(areaMaxima, areaDerecha);

        int areaIzquierda = (a - x - 1) * b;

        areaMaxima = Math.max(areaMaxima, areaIzquierda);

        int areaArriba = (b - y - 1) * a;

        areaMaxima = Math.max(areaMaxima, areaArriba);

        int areaAbajo = (y) *a;

        areaMaxima = Math.max(areaMaxima, areaAbajo);

        return areaMaxima;
    }
}
