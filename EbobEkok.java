import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 Sayısını Giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 Sayısını Giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;
        int ekok = 1;
        int i = 1;

        if (n1 < n2) {
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("EBOB : " + ebob);
            ekok = (n1 * n2)/ebob;
            System.out.println("EKOK : " + ekok);
        } else {
            System.out.println("n1 < n2 olmalıdır!");
        }
    }
}
