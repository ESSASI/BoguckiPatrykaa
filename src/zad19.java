public class zad19 {
    public static void main(String[] args) {
    double ilosckonsumentów = 12467;
    double jeden = 0.14;
    double cytrus = 0.64;

    double konsumencijeden = ilosckonsumentów * jeden;
    double konsumencicytrus  = cytrus * ilosckonsumentów;


    int przyblizonacenajednego = (int)konsumencijeden;
    int przyblizonacenacytrusa = (int)konsumencicytrus;

        System.out.println("Przyblizona ilosc osob co kupuje jeden to: " + przyblizonacenajednego );
        System.out.println("Przyblizona ilosc osob co kupuje cytrusa to: " + przyblizonacenacytrusa );

    }
}
