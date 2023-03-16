import java.util.Scanner;

public class metotasalsayı {

    static void asalsayı() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n = scan.nextByte();
        int result = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result++;
            }
        }
        if (result == 0) {
            System.out.print(n + " sayısı ASALDIR");
        } else {
            System.out.print(n + " sayısı ASAL değildir");
        }
    }

    public static void main(String[] args) {
        asalsayı();
    }

}
