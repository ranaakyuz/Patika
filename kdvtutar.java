import java.util.Scanner;

public class kdvtutar {
    public static void main(String[] args) {

        double fiyat;
        Scanner inp = new Scanner(System.in);

        System.out.print("Fiyat Bilgisini Giriniz : ");
        fiyat = inp.nextDouble();
        System.out.println("KDV'siz Fiyat : " + fiyat);

        boolean oran = fiyat>1000;
        System.out.println(oran ? "KDV Oranı : " + 0.08 : "KDV Oranı : " + 0.18 );

        boolean tutar = fiyat>1000;
        System.out.println(tutar ? "KDV Tutarı : " + 0.08 : "KDV Tutarı : " + 0.18);

        boolean karar = fiyat>1000;
        System.out.println(karar ? "KDV'li Fiyat : " + (fiyat + fiyat * 0.08) : "KDV'li Fiyat : " + (fiyat + fiyat * 0.18) );
    }
}
