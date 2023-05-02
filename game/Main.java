import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row,column;

        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        System.out.println("Mayınların Konumu");
        System.out.print("Satır Sayısı :");
        row = scan.nextInt();
        System.out.print("Sütun Sayısı :");
        column = scan.nextInt();

        MineSweeper mine = new MineSweeper(row,column);
        mine.run();
    }
}