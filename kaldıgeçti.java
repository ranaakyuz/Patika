import java.util.Scanner;
public class kaldıgeçti {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkçe,muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        if (mat<0 || mat>100) {
            mat = 0;
        }
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        if (fizik<0 || fizik>100) {
            fizik = 0;
        }
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        if (kimya<0 || kimya>100) {
            kimya = 0;
        }
        System.out.print("Türkçe Notunuz : ");
        turkçe = input.nextInt();
        if (turkçe<0 || turkçe>100) {
            turkçe = 0;
        }
        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();
        if (muzik<0 || muzik>100) {
            muzik = 0;
        }

        double avarage = (mat + fizik + kimya + turkçe + muzik) / 5 ;
        System.out.println("Ortalamanız : " + avarage);

        if (avarage < 55) {
            System.out.println("Sınıfta Kaldınız");
        } else {
            System.out.println("Tebrikler Sınıfı Geçtiniz ");
        }
    }
}


 

