import java.util.ArrayList;

public class Implementaciones {

    public double Ejercicio1(double n1, double n2, double n3, double n4, double n5) {
        assert n1 >= 0 && n1 <= 5;
        assert n2 >= 0 && n2 <= 5;
        assert n3 >= 0 && n3 <= 5;
        assert n4 >= 0 && n4 <= 5;
        assert n5 >= 0 && n5 <= 5;

        return n1 * 0.15 + n2 * 0.20 + n3 * 0.15 + n4 * 0.30 + n5 * 0.20;
    }

    public String Ejercicio2(double n1, double n2, double n3, double n4, double n5) {

        double nota = Ejercicio1(n1, n2, n3, n4, n5);

        if (nota < 2.0) {
            return "No puede habilitar, Nota: " + nota;
        } else if (nota < 3.0) {
            return "Reprobó, Nota: " + nota;
        } else if (nota > 4.5) {
            return "Aprobó con Excelente Nota: " + nota;
        } else {
            return "Aprobó, Nota: " + nota;
        }
    }

    public double calcularIVA(double precioBruto) {
        assert precioBruto >= 0;
        precioBruto += precioBruto * 0.19;
        return precioBruto;
    }

    public double Ejercicio4(double precioBruto) {
        assert precioBruto >= 0;
        double precio = precioBruto;
        if (precioBruto > 150000) {
            precio = precioBruto - (precioBruto * 0.05);
        }
        return calcularIVA(precio);
    }

    public double Ejercicio5(double x1, double y1, double x2, double y2) {
        assert x1 >= 0 && y1 >= 0;
        assert x2 >= 0 && y2 >= 0;
        double distanciaX = x2 - x1;
        double distanciaY = y2 - y1;

        return Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
    }

    public int Ejercicio6(int n) {
        assert n >= 0 && n <= 9;

        int num1 = n;
        int num2 = n * 10 + n;
        int num3 = n * 100 + n * 10 + n;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        return num1 + num2 + num3;
    }

    //

    public ArrayList<Integer> equipaje = new ArrayList<>();

    public void Boing47(){
        int cargaEquipaje = 18000;
        int pesoMaxPorEquipaje = 500;
    }

    public void AddEquipajeBoing47(){
        int cargaEquipaje = 18000;
        int pesoMaxPorEquipaje = 500;
    }

    private int ValorBulto(int kilo){
        assert kilo > 0;
        if (kilo <= 25){
            return 0;
        } else if (kilo <= 300) {
            return kilo * 1500;
        } else if (kilo <= 500) {
            return kilo * 2500;
        } else {
            return -1;
        }
    }
}
