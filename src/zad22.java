import java.util.Scanner;
public class zad22 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);

        int liczbaakcji = 1000;
        double cenazaakcje = 32.87;
        double cenazaakcjepotyg = 33.92;
        double prowizja = 0.02;
        double cenadlabrokerapotyg = cenazaakcjepotyg * prowizja *liczbaakcji;
        double cenadlabrokera = cenazaakcje * prowizja * liczbaakcji;
        double cenazakupnoakcji = liczbaakcji * cenazaakcje;
        double cenasprzedazyakcji = liczbaakcji * cenazaakcjepotyg;
        double zysklubstratakupna = cenazakupnoakcji - cenasprzedazyakcji;
        double zysklubstratabrokera = cenadlabrokera - cenadlabrokerapotyg;
        double cenawrazzbrokerem = cenadlabrokera + cenazakupnoakcji;
        double cenawrazbrokerempotyg = cenasprzedazyakcji -cenadlabrokerapotyg;
        double nwm = cenawrazzbrokerem - cenawrazbrokerempotyg;

        System.out.println("Koszt kupna akcji: " + cenazakupnoakcji);
        System.out.println("Cena sprzedazy akcji: " + cenasprzedazyakcji);
        System.out.println("Cena dla brokera przy kupnie: "+cenadlabrokera);
        System.out.println("Cena dla brokera przy sprzedazy: " + cenadlabrokerapotyg);
        System.out.println("Zysk lub strata na brokerze?: " +zysklubstratabrokera);
        System.out.println("Zysk lub strata na kupnie?: " +zysklubstratakupna);
        System.out.println("Cena wraz z brokerem " +cenawrazzbrokerem);
        System.out.println("Cena wraz z brokerem po tygodniu " +cenawrazbrokerempotyg);
        System.out.println("Zysk lub strata na kupnie?: " +nwm);








    }
    }

