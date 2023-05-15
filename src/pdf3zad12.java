public class pdf3zad12 {
    public static void main(String[] args) {
        double suma = 0.0;

        for (int i = 1; i <= 30; i++) {
            double liczba = (double) i / (31 - i);
            suma += liczba;
        }

        System.out.println("Suma: " + suma);
    }
}
