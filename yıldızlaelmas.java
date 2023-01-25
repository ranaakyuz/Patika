import java.util.Scanner;

public class yıldızlaelmas {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz : ");
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n-i); k++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= (2*i)-1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int k = n-i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
