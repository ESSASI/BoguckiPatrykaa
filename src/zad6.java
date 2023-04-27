public class zad6 {
    public static void main(String[] args) {
        int cztery =4;
        int trzy = 3;
        int dwa = 2;
        int pomieszczeniejeden = trzy*cztery;
        int pomieszczeniedwa =trzy*cztery;
        int pomieszczenietrzy = dwa*trzy;
        int pomieszczeniecztery =dwa*dwa;
        int calkowitapowierzchnia = pomieszczeniejeden + pomieszczeniedwa + pomieszczenietrzy + pomieszczeniecztery;

        System.out.println("Powierzchnia calkowita wynosi: " + calkowitapowierzchnia);
        System.out.println("Powierzchnia pokoju numer 1 wynosi:" + pomieszczeniejeden);
        System.out.println("Powierzchnia pokoju numer 2 wynosi:" + pomieszczeniedwa);
        System.out.println("Powierzchnia pokoju numer 3 wynosi:" + pomieszczenietrzy);
        System.out.println("Powierzchnia pokoju numer 4 wynosi:" + pomieszczeniecztery);

        float liczbaosob = 4;
        float powierzchnianajednaosobe = calkowitapowierzchnia / liczbaosob;
        System.out.println("Powierzchnia na 1 osobe wynosi: " + powierzchnianajednaosobe);



    }
}