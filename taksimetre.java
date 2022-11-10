import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int KM;
        double perKM = 2.20 , total = 10;

        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi KM Cinsinden Giriniz : ");
        KM = input.nextInt();

        total += (KM * perKM);

        total = total < 20 ? 20 : total;
        System.out.print("Toplam Tutar : " + total);

    }
}
