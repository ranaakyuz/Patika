import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName,password;
        Scanner input = new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Şifreniz : ");
            password = input.nextLine();

            if (userName.equals("rana") && (password.equals("123"))) {
                System.out.println("Bankaya Hoşgeldiniz");
                do {
                    System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
                    System.out.print("Yapmak İstediğiniz İşlemi Seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatıracağınız Tutar : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekeceğiniz Tutar : ");
                            price = input.nextInt();
                            if (balance < price) {
                                System.out.println("Bakiye Yetersiz!");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.print("Tekrar Görüşmek Üzere");
                            break;
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.print("Kullanıcı Adı Veya Şifre Yanlış! Lütfen Tekrar Deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur.Lütfen Bankanızla İletişime Geçin!");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
