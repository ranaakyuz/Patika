import java.util.Scanner;

public class çiftvedördünkkatları {
    public static void main(String[] args) {
        int k;
        int total = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            k = inp.nextInt();
            if ((k % 2 == 0) && (k % 4 == 0)) {
                total += k;
            }
        } while (k % 2 == 0) ;

        System.out.println("Toplam : " + total);
    }
}
