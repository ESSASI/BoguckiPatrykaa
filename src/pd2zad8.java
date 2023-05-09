import java.util.Scanner;

public class pd2zad8 {

    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        System.out.print("Podaj ilosc pakietow");
        int pakiet = wprowadz.nextInt();
        double cena = pakiet * 99;

        double rabat1 = cena * 0.2;
        double rabat2 = cena * 0.3;
        double rabat3 = cena * 0.4;
        double rabat4 = cena * 0.5;


        if(pakiet>=10&pakiet<=19){
            System.out.println("Rabat na ta oferte wynosi 20%, czyli zaplacisz " + (cena-rabat1) );
        }else  if(pakiet>=20&pakiet<=49){
            System.out.println("Rabat na ta oferte wynosi 30%, czyli zaplacisz " + (cena-rabat2) );
        }else  if(pakiet>=50&pakiet<=99){
            System.out.println("Rabat na ta oferte wynosi 40%, czyli zaplacisz " + (cena-rabat3) );
        }else  if(pakiet>=100){
            System.out.println("Rabat na ta oferte wynosi 50%, czyli zaplacisz " + (cena-rabat4) );
        }



    }
}
