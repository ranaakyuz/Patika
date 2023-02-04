import java.util.Scanner;

public class manavkasa {
    public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);

         int armut,elma,domates,muz,patlıcan;

         System.out.print("Armut Kaç Kilo : ");
         armut = inp.nextInt();
         System.out.print("Elma Kaç Kilo : ");
         elma = inp.nextInt();
         System.out.print("Domates Kaç Kilo : ");
         domates = inp.nextInt();
         System.out.print("Muz Kaç Kilo : ");
         muz = inp.nextInt();
         System.out.print("Patlıcan Kaç Kilo : ");
         patlıcan = inp.nextInt();

         double fiyat = (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5.00);
         System.out.println("Toplam Tutar : " + fiyat);



    }
}
