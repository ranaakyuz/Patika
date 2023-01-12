import java.util.Scanner;

public class dörtvebeşinkuvveti {
    public static void main(String[] args) {
        int k;
        int i;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz : ");
        k = inp.nextInt();

        for (i = 1; i <= k; i*=4) {
            System.out.println("4'ün Kuvveti : " + i);
        }
        for (i = 1; i <= k; i*=5) {
            System.out.println("5'in Kuvveti : " + i);
        }
    }
}
