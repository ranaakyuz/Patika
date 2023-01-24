import java.util.Scanner;

public class harmoniksayı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = inp.nextInt();
        double result = 0.0;

        for (int i = 1; i <= number; i++) {
            result += (1.0/i);
        }
        System.out.println("Harmonik Sayı : " + result);
    }
}
