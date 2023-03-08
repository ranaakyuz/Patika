import javax.sound.midi.SysexMessage;

public class palindrom {
    static boolean isPalindrom(int number) {
        int value = number;
        int reverseNumber = 0;
        int lastNumber;
        while (value != 0) {
            System.out.println("------------");
            System.out.println("Sayı = " + value);
            lastNumber = value % 10;
            System.out.println("Son Basamak = " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni Sayı = " + reverseNumber);
            value /= 10;
            System.out.println("Yeni Değer = " + value);
        }
        System.out.println("------------");
        if (number == reverseNumber) {
            System.out.println("Palindrom Sayıdır");
            return true;
        } else {
            System.out.println("Palindrom Sayı Değildir");
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(999));
    }
}
