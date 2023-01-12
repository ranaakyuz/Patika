import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        int k,l,m,n;
        int total = 1,total1 = 1,total2 = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kombinasyon Sayısı : ");
        k = inp.nextInt();
        System.out.print("Kaçlı Kombinasyon : ");
        l = inp.nextInt();
        m = k-l;

        for (int a = 1; a <= k; a++) {
            total = total * a;
        }
        for (int b = 1; b <= l; b++) {
            total1 = total1 * b;
        }
        for (int c = 1; c <= m; c++) {
            total2 = total2 * c;
        }
        n = total/(total1*total2);
        System.out.print("Sonuç : " + n);
    }
}



