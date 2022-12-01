import java.util.Scanner;
public class sayısıralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp = new Scanner(System.in);

        System.out.print("1.Sayıyı Giriniz : ");
        a = inp.nextInt();
        System.out.print("2.Sayıyı Giriniz : ");
        b = inp.nextInt();
        System.out.print("3.Sayıyı Giriniz : ");
        c = inp.nextInt();

        if ((a < b) && (a < c)){
            if (b < c) {
                System.out.println("Girdiğiniz Sayıların Sıralaması : a < b < c ");
            } else {
                System.out.println("Girdiğiniz Sayıların Sıralaması : a < c < b ");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("Girdiğiniz Sayıların Sıralaması : b < a < c ");
            } else {
                System.out.println("Girdiğiniz Sayıların Sıralaması : b < c < a ");
            }
        } else if ((c < a) && (c < b)) {
            if (a < b) {
                System.out.println("Girdiğiniz Sayıların Sıralaması : c < a < b ");
            } else {
                System.out.println("Girdiğiniz Sayıların Sıralaması : c < b < a ");
            }
        }
    }
}
