import java.util.Scanner;

public class mükemmelsayı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int total = 0;

        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (number == total) {
            System.out.print(number + " Mükemmel Sayıdır.");
        } else {
            System.out.print(number + " Mükemmel Sayı Değildir.");
        }
    }
}
