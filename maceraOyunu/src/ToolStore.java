import java.util.Scanner;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation(){
        System.out.println("----------Mağazaya Hoş Geldiniz!----------");
        System.out.println("1 - Silahlar");
        System.out.println("2 - Zırhlar");
        System.out.println("3 - Çıkış Yap");
        System.out.print("Seçiminiz: ");
        int selectCase = Location.input.nextInt();

        switch (selectCase){
            case 1 :
                printWeapon();
                buyWeapon();
                break;
            case 2 :
                printArmor();
                break;
            case 3 :
                return true;
            default:
                System.out.println("Geçersiz bir değer girdiniz. Tekrar giriniz");
                selectCase = Location.input.nextInt();

        }
        return true;
    }

    public void printWeapon(){
        System.out.println("-------Silahlar-------");
        for (Weapon w : Weapon.weapons()){
            System.out.println(w.getId() + " - " + w.getName() + " <Para : " + w.getPrice() + " , Hasar : " + w.getDamage() + ">");
        }

    }

    public void buyWeapon(){
        System.out.print("Bir silah seçiniz: ");
        int selectWeaponId = input.nextInt();

        Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponId);

        if (selectedWeapon != null){
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                System.out.println("Yeterli paranız bulunmamaktadır!");
            }
            else {
                System.out.println(selectedWeapon.getName() + " silahını satın aldınız!");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                //System.out.println("Önceki silahınız: " + this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                //System.out.println("Yeni silahınız: " + this.getPlayer().getInventory().getWeapon().getName());

            }
        }
    }

    public void printArmor(){
        System.out.println("Zırhlar");
    }
}
