import java.util.Scanner;

public class desenmetot {

    static void minus(int number, int value){
        if (number > 0){
            System.out.print(number + " ");
            minus(number - 5, value);
        }else if( number <= 0){
            plus(number, value);
        }
    }
    static void plus(int number, int value){
        if (value >= number){
            System.out.print(number + " ");
            plus(number + 5, value);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int number = scan.nextInt();
        int value = number;
        minus(number, value);
    }
}
