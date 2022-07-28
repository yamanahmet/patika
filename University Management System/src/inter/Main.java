package inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz: ");
        double price = input.nextDouble();

        System.out.print("Kart no giriniz: ");
        String cardNumber = input.next();

        System.out.print("Son kullanım tarihini giriniz: ");
        String expireDate = input.next();

        System.out.print("Güvenlik kodunu giriniz: ");
        String cvc = input.next();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("Banka Seçiniz: ");
        int selectBank = input.nextInt();

        switch (selectBank){
            case 1 :
                ABankasi aPos = new ABankasi("A Bankası", "12345678","7865546789");
                aPos.connect("127.1.1.1");
                aPos.payment(price, cardNumber, expireDate, cvc);
                break;
            case 2 :
                BBankasi bPos = new BBankasi("B Bankası", "12345678","7865546789");
                bPos.connect("127.1.1.1");
                bPos.payment(price, cardNumber, expireDate, cvc);
                break;
            default:
                System.out.println("Geçerli bir sayı giriniz!");
        }
    }
}
