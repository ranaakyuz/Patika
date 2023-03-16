import java.util.Scanner;

public class metotüslüsayı {

    public static int üs(int a , int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * üs(a , b-1);
        }
    }
    public static void main(String[] args) {
        int a,b;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Taban Değerini Giriniz : ");
            a = inp.nextInt();
            System.out.print("Üs Değerini Giriniz : ");
            b = inp.nextInt();

            System.out.println("Sonuç : " + üs(a,b));
        } while (a > 0);
    }
}