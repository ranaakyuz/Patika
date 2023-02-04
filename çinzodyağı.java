import java.util.Scanner;
public class çinzodyağı {
    public static void main(String[] args) {
         int doğumyılı;
         Scanner inp = new Scanner(System.in);
         System.out.print("Doğum Yılınızı Giriniz : ");
         doğumyılı = inp.nextInt();

         if (doğumyılı %12 == 0) {
             System.out.print("Çin Zodyağı Burcunuz : Maymun");
         } else if (doğumyılı %12 == 1) {
             System.out.print("Çin Zodyağı Burcunuz : Horoz");
         } else if (doğumyılı %12 == 2) {
             System.out.print("Çin Zodyağı Burcunuz : Köpek");
         } else if (doğumyılı %12 == 3) {
             System.out.print("Çin Zodyağı Burcunuz : Domuz");
         } else if (doğumyılı %12 == 4) {
             System.out.print("Çin Zodyağı Burcunuz : Fare");
         } else if (doğumyılı %12 == 5) {
             System.out.print("Çin Zodyağı Burcunuz : Öküz");
         } else if (doğumyılı %12 == 6) {
             System.out.print("Çin Zodyağı Burcunuz : Kaplan");
         } else if (doğumyılı %12 == 7) {
             System.out.print("Çin Zodyağı Burcunuz : Tavşan");
         } else if (doğumyılı %12 == 8) {
             System.out.print("Çin Zodyağı Burcunuz : Ejderha");
         } else if (doğumyılı %12 == 9) {
             System.out.print("Çin Zodyağı Burcunuz : Yılan");
         } else if (doğumyılı %12 == 10) {
             System.out.print("Çin Zodyağı Burcunuz : At");
         } else if (doğumyılı %12 == 11) {
             System.out.print("Çin Zodyağı Burcunuz : Koyun");
         } else {
             System.out.print("Hatalı Veri Girdiniz !");
         }
    }
}
