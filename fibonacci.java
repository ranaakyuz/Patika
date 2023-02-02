import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int a = 0;
        int b = 1;
        int total = 0;

        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextInt();

        System.out.print(a + " " + b);

        for (int i = 1; i <= number; i++) {
            total = a + b;
            System.out.print(" " + total);

            a = b;
            b = total;
        }
    }
}
