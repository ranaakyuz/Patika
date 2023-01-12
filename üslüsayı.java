import java.util.Scanner;

public class üslüsayı {
    public static void main(String[] args) {
        int a,b;
        Scanner inp = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayı : ");
        a = inp.nextInt();
        System.out.print("Üs Olacak Sayı : ");
        b = inp.nextInt();

        int total=1;
        for (int i = 1; i <= b; i++) {
            total *= a;
        }
        System.out.println("Sonuç : " + total);
    }
}
