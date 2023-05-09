import java.util.Scanner;

public class pd2zad4 {

    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);

        System.out.println("Podaj wynik z 1 testu");
        double test1  = wprowadz.nextDouble();
        System.out.println("Podaj wynik z 2 testu");
        double test2  = wprowadz.nextDouble();
        System.out.println("Podaj wynik z 3 testu");
        double test3  = wprowadz.nextDouble();

        double ilosctestow = 3;
        double wynik = (test1+test2+test3)/ilosctestow;




        System.out.println("Twoja srednia to " + wynik);

        if(wynik<=100&wynik>=90){
            System.out.println("Twoje ocena to 5");

        } else if(wynik<=89&wynik>=80){
            System.out.println("Twoje ocena to 4");

        }  else if(wynik<=79&wynik>=70){
            System.out.println("Twoje ocena to 3");

        }  else if(wynik<=69&wynik>=60){
            System.out.println("Twoje ocena to 2");

        } else if(wynik<=59){
            System.out.println("Twoje ocena to 1");
        }




    }
}
