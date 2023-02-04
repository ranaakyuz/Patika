import java.util.Scanner;
public class uçakbileti {
    public static void main(String[] args) {
        int mesafe,yaş,yolculuktipi,gidişdönüş;
        double tutar,indirimli,yaşindirimi,indirimsiz,çifttutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi KM Türünden Giriniz : ");
        mesafe = inp.nextInt();
        tutar = (mesafe * 0.10);
        System.out.print("Yaşınızı Giriniz : ");
        yaş = inp.nextInt();
        System.out.print("Yolculuk Tipini Seçiniz \n1.Tek Yön \n2.Gidiş-Dönüş\n= ");
        yolculuktipi = inp.nextInt();

        if (yolculuktipi == 1 && yaş >= 1 && yaş <= 100 && mesafe >= 1) {
            System.out.print("Tek Yönlü Yolculuk Seçtiniz ");
            if (yaş < 12) {
                indirimli = tutar - (tutar * 0.50);
                System.out.print("Ödeyeceğiniz Tutar : " + indirimli + " TL");
            } else if (yaş >= 12 && yaş <= 24) {
                indirimli = tutar - (tutar * 0.10);
                System.out.print("Ödeyeceğiiniz Tutar : " + indirimli + " TL");
            } else if (yaş >= 65) {
                indirimli = tutar - (tutar * 0.30);
                System.out.print("Ödeyeceğiiniz Tutar : " + indirimli + " TL");
            } else {
                System.out.print("Ödeyeceğiiniz Tutar : " + tutar + " TL");
            }
        }
        else if (yolculuktipi == 2 && yaş >= 1 && yaş <= 100 && mesafe >= 1) {
            çifttutar = tutar * 2;
            System.out.print("Çift Yönlü Yolculuk Seçtiniz ");
            if (yaş < 12) {
                indirimli = çifttutar - (tutar * 0.70);
                System.out.print("Ödeyeceğiiniz Tutar : " + indirimli + " TL");
            } else if (yaş >= 12 && yaş <= 24) {
                indirimli = çifttutar - (tutar * 0.40);
                System.out.print("Ödeyeceğiiniz Tutar : " + indirimli + " TL");
            } else if (yaş >= 65) {
                indirimli = çifttutar - (tutar * 0.50);
                System.out.print("Ödeyeceğiiniz Tutar : " + indirimli + " TL");
            } else {
                indirimsiz = çifttutar - (çifttutar * 0.20);
                System.out.print("Ödeyeceğiiniz Tutar : " + indirimsiz + " TL");
            }
        } else {
            System.out.print("Hatalı Veri Girişi !");
        }
    }
}
