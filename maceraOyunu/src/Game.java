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
        System.out.print("Lütfen bir karakter seçin!");
        player.selectChar();

        Location location = null;

        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("########### Bölgeler ##########");
            System.out.println();
            System.out.println("1 - Güvenli Ev -> Burası sizin için güvenli bir ev, düşman yok!");
            System.out.println("2 - Mağaza -> Silah veya zırh satın alabilirsiniz.");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
            int selection = input.nextInt();

            switch (selection){
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            if(!location.onLocation()){
                System.out.println("GAME OVER!");
                break;
            }

        }

    }


}
