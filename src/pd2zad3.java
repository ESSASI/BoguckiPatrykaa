import java.util.Scanner;

public class pd2zad3 {

    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);

        System.out.println("Podaj swoja wage");
        double waga  = wprowadz.nextDouble();
        System.out.println("Podaj swoj wzrost w m");
        double wzrost  = wprowadz.nextDouble();

        double wzrost2 = wzrost*wzrost;
        double BMI = waga/wzrost2;





        if(BMI>=25){
            System.out.println("Masz nadwage");
        }
        else if(BMI<=18.5){
            System.out.println("Madz niedowage");
        }else{
            System.out.println("Waga prawidłowa");
        }





    }
}

