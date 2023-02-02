import java.util.Scanner;

public class asalsayı {
    public static void main(String[] args) {
        System.out.print("1'den 100'e Kadar Olan Asal Sayılar : ");

        for (int i = 2; i <= 9; i++) {
            if (i % 4 != 0 && i % 6 != 0 && i % 8 != 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        for (int k = 2; k <= 100; k++) {
            if (k % 2 != 0 && k % 3 != 0 && k % 4 != 0 && k % 5 != 0 && k % 6 != 0 && k % 7 != 0 && k % 8 != 0 && k % 9 != 0 && k % 10 != 0) {
                System.out.print(k);
                System.out.print(" ");
            }
        }
    }
}
