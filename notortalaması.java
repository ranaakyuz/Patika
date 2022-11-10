import java.util.Scanner;

public class notortalaması {
    public static void main(String[] args) {

    int mat,fizik,kimya,turkçe,tarih,muzik;

    Scanner inp = new Scanner(System.in);

    System.out.print("Matematik notunuz : ");
    mat = inp.nextInt();

    System.out.print("Fizik notunuz : ");
    fizik = inp.nextInt();

    System.out.print("Kimya notunuz : ");
    kimya = inp.nextInt();

    System.out.print("Türkçe notunuz : ");
    turkçe = inp.nextInt();

    System.out.print("Tarih notunuz : ");
    tarih = inp.nextInt();

    System.out.print("Müzik notunuz : ");
    muzik = inp.nextInt();

    int toplam = (mat+fizik+kimya+turkçe+tarih+muzik);
    double sonuc = toplam/6;

    System.out.println("Ortalamanız : " + sonuc);

    int a=60;

    String str = sonuc<a ? "Sınıfta kaldı" : "Sınıfı geçti";
    System.out.print("Son durum : " + str);
    }
}