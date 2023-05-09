import java.util.Scanner;

import java.util.Arrays;

public class pd2zad7 {

    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        System.out.print("Podaj 1 imie ");
        String imie1 = wprowadz.nextLine();
        System.out.print("Podaj 2 imie ");
        String imie2 = wprowadz.nextLine();
        System.out.print("Podaj 3 imie ");
        String imie3 = wprowadz.nextLine();

        String[] arr = { imie1 , imie2 , imie3 };
        Arrays.sort(arr);
        System.out.println("Posortowane: " + Arrays.toString(arr));



    }
}
