import java.util.Scanner;
import java.util.Arrays;

public class maxmin {
    public static void main(String[] args) {

        int[] valueList = {15,12,788,1,-1,-778,2,0};
        Scanner input = new Scanner(System.in);

        System.out.println("Dizi : " + Arrays.toString(valueList));
        Arrays.sort(valueList);
        System.out.println("Sıralı Dizi : " + Arrays.toString(valueList));

        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();
        int min = number;
        int max = number;

        for(int item: valueList){
            if(item > number){
                max = item;
                break;
            }
        }
        for(int i = valueList.length-1; i >= 0; --i){
            if(valueList[i] < number){
                min = valueList[i];
                break;
            }
        }
        System.out.println("Girilen Sayıdan Büyük En Yakın Sayı : " + max);
        System.out.println("Girilen Sayıdan Küçük En Yakın Sayı : " + min);
    }
}


