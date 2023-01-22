import java.util.Scanner;

public class armstrongsayısı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;
        int total = 0;

        System.out.print("Bir Sayı Giriniz : ");
        number = inp.nextInt();

        while (number != 0) {
            total += (number % 10);
            number /= 10;
        }
        System.out.println("Rakamlar Toplamı : " + total);
    }
}
