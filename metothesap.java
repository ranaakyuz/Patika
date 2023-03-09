import java.util.Scanner;

public class metothesap {
    static void plus(){
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". Sayı : ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç Adet Sayı Gireceksiniz : ");
        int counter = scan.nextInt();
        int number , result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı : ");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". Sayı : ");
            number = scan.nextInt();
            if (number == 1) {
                break;
            }
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç Adet Sayı Gireceksiniz : ");
        int counter = scan.nextInt();
        double number;
        double result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı : ");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 Giremezsiniz");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz : ");
        int base = scan.nextInt();
        System.out.print("Üs Değerini Giriniz : ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuç : " + result);
    }
    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Sonuç : " + result);
    }
    static void mod() {
        Scanner scan = new Scanner(System.in);
        int result;
        System.out.print("Sayı Giriniz : ");
        int number = scan.nextInt();

        if(number % 2 == 0){
            System.out.println("Sonuç : Sayı Çifttir");
        }else{
            System.out.println("Sonuç : Sayı Tektir");
        }
    }
    static void end() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Uzun Kenarı Giriniz : ");
        int a = scan.nextInt();
        System.out.print("Kısa Kenarı Giriniz : ");
        int b = scan.nextInt();
        int result = 1;

        System.out.println("Çevre : " + (2 * ( a + b)));
        System.out.println("Alan : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap\n";

        System.out.print(menu);

        do {
            System.out.print("Lütfen Bir İşlem Seçiniz : ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    end();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
        }

    } while (select != 0);

  }
}








