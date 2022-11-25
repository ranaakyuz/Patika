import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        int n1 , n2 , select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.print("ikinci Sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplamaπ\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölüm : " + (n1 / n2));
                } else {
                    System.out.println("Bir Sayı 0'a Bölünemez!");
                }
                break;
            default:
                System.out.println("Hatalı Seçim Yaptınız Tekrar Deneyiniz.");

        }
    }
}
