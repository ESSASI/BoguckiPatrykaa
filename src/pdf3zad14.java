public class pdf3zad14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 2 || j == i) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println("#");
        }
    }
}