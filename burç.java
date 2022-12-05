import java.util.Scanner;
public class burç {
    public static void main(String[] args) {
        int month,day;
        boolean isError = false;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Doğduğunuz Ayı Giriniz : ");
        month = inp.nextInt();
        System.out.print("Doğduğunuz Günü Giriniz : ");
        day = inp.nextInt();

        if (month == 1 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("Burcunuz Oğlak");
            } else {
                System.out.println("Burcunuz Kova");
            }
        } else {
            isError = true;
        }
        if (month == 2 && (day >= 1 && day <= 30)) {
            if (day < 20) {
                System.out.println("Burcunuz Kova");
            } else {
                System.out.println("Burcunuz Balık");
            }
        } else {
            isError = true;
        }
        if (month == 3 && (day >= 1 && day <= 31)) {
            if (day < 21) {
                System.out.println("Burcunuz Balık");
            } else {
                System.out.println("Burcunuz Koç");
            }
        } else {
            isError = true;
        }
        if (month == 4 && (day >= 1 && day <= 30)) {
            if (day < 21) {
                System.out.println("Burcunuz Koç");
            } else {
                System.out.println("Burcunuz Boğa");
            }
        } else {
            isError = true;
        }
        if (month == 5 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("Burcunuz Boğa");
            } else {
                System.out.println("Burcunuz İkizler");
            }
        } else {
            isError = true;
        }
        if (month == 6 && (day >= 1 && day <= 30)) {
            if (day < 23) {
                System.out.println("Burcunuz İkizler");
            } else {
                System.out.println("Burcunuz Yengeç");
            }
        } else {
            isError = true;
        }
        if (month == 7 && (day >= 1 && day <= 31)) {
            if (day < 23) {
                System.out.println("Burcunuz Yengeç");
            } else {
                System.out.println("Burcunuz Aslan");
            }
        } else {
            isError = true;
        }
        if (month == 8 && (day >= 1 && day <=  31)) {
            if (day < 23) {
                System.out.println("Burcunuz Aslan");
            } else {
                System.out.println("Burcunuz Başak");
            }
        } else {
            isError = true;
        }
        if (month == 9 && (day >= 1 && day <= 30)) {
            if (day < 23) {
                System.out.println("Burcunuz Başak");
            } else {
                System.out.println("Burcunuz Terazi");
            }
        } else {
            isError = true;
        }
        if (month == 10 && (day >= 1 && day <= 31)) {
            if (day < 23) {
                System.out.println("Burcunuz Terazi");
            } else {
                System.out.println("Burcunuz Akrep");
            }
        } else {
            isError = true;
        }
        if (month == 11 && (day >= 1 && day <= 30)) {
            if (day < 22) {
                System.out.println("Burcunuz Akrep");
            } else {
                System.out.println("Burcunuz Yay");
            }
        } else {
            isError = true;
        }
        if (month == 12 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("Burcunuz Yay");
            } else {
                System.out.println("Burcunuz Oğlak");
            }
        } else {
            isError = true;
        }
    }
}
