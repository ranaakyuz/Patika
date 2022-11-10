import java.util.Scanner;

public class dairealanı {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        int merkezacı;

        System.out.print("Yarıçapı Giriniz : ");
        Scanner inp = new Scanner(System.in);
        r = inp.nextInt();

        System.out.print("Merkez Açıyı Giriniz : ");
        Scanner inr = new Scanner(System.in);
        merkezacı = inp.nextInt();

        double alan = (pi*(r*r)*merkezacı/360);
        System.out.println("Dairenin Alanı : " + alan);



        
    }
}
