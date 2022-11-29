import java.util.Scanner;
public class havadurumu {
    public static void main(String[] args) {
        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklığı Giriniz : ");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz");
        } else if (heat <=25) {
            if ((10 < heat) && (heat < 15) ) {
                System.out.println("Hem Pikniğe Hem Sinemaya Gidebilirsiniz");
            }
            if (heat < 10) {
                System.out.println("Sinemaya Gidebilirsiniz");
            }
            if (heat > 15) {
                System.out.println("Pikniğe Gidebilirsiniz");
            }
        } else {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }

    }
}
