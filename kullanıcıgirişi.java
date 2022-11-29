import java.util.Scanner;
public class kullanıcıgirişi {
    public static void main(String[] args) {
        String userName,password,karar,newpassword;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();
        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && (password.equals("java123"))){
            System.out.println("Giriş Yapıldı");
        } else if (password != ("java123") && (userName.equals("patika"))){
                System.out.println("Şifreyi Yanlış Girdiniz ");
                System.out.println("Şifrenizi Değiştirmek İster Misiniz ? ");
                karar = inp.nextLine();
                if (karar.equals("evet")) {
                    System.out.print("Yeni Şifreyi Giriniz : ");
                    password = inp.nextLine();
                    if (password.equals("java123")) {
                        System.out.println("Şifre Oluşturulamadı.Lütfen Başka Şifre Giriniz ! ");
                    } else if (password.equals("patika")) {
                        System.out.println("Yeni Şifreniz Kullanıcı Adınız İle Aynı Olamaz !");
                    } else {
                        System.out.println("Yeni Şifreniz Oluşturuldu");
                    }
                } else {

                }
        }
    }
}
