import java.util.Scanner;

public class girilensayıyakadar {
    public static void main(String[] args) {
        int k , bolunen = 0;
        double ortalama = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayıyı Giriniz  : ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                ortalama+=i;
                bolunen++;
            }
        }
        System.out.println("3'e ve 4'e Bölünen Sayıların Ortalaması : " + (ortalama/bolunen));
    }
}
