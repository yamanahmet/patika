import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    public Player player;
    public Location location;

    public void start(){
        System.out.println("Macera Oyununa Hoş Geldiniz!");
        System.out.println("Lütfen bir isim giriniz: ");
        //String playerName = input.nextLine();
        Player player = new Player("Ahmet");
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli adaya hoş geldiniz! Burada yaşanan her şey gerçek!");
        System.out.println("Lütfen bir karakter seçin!");
        player.selectChar();
    }


}
