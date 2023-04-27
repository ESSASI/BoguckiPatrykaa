public class zad18 {
    public static void main(String[] args) {
    double iloscakcji = 600;
    double cenajednejakcji = 21.77;
    double prowizja = 0.02;

    double cenabezprowizji = iloscakcji * cenajednejakcji;
    double cenazprowizja  = cenabezprowizji * prowizja;


        System.out.println("Kwota bez prowizji wynosi: " + cenabezprowizji+ " ,prowizja wynosi: " + prowizja + " . Łączna kwota wynosi: " + cenazprowizja);

    }
}
