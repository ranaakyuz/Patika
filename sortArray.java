import java.util.Scanner;
import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dizinin Boyutu n : ");
        int n = scan.nextInt();
        int[] list = new int[n];

        System.out.println("Dizinin Elemanlarını Giriniz : ");
        for (int i = 0; i < n; i ++){
            System.out.print((i+1 + ". Elemanı : "));
            list[i] = scan.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));
    }
}
