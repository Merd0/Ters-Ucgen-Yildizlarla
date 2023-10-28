import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner gürkan = new Scanner(System.in);
        System.out.print("Kaç satırlık üçgen çizmek istiyosunuz :");
        int n = gürkan.nextInt();

       for ( int i = n; i >= 0 ; i-- ) {
            for (int i1 = 0; i1 < n - i; i1 ++ ) {
                System.out.print(" ");
            }
            for (int i2 = 0; i2 < (i * 2) + 1 ; i2++ ) {
                System.out.print("*");
            }
           System.out.println();
       }


    }
}