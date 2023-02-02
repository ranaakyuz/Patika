import java.util.Scanner;

public class tersüçgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz : ");
        int n = inp.nextInt();

        for (int i = n; i >= 1; i--) {
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
