public class Patika {
    public static void main(String[] args) {

        //Calisan c1 = new Calisan("Mustafa Çetindağ", "05555555555555", "indo@patika.dev");

        //Akademisyen a1 = new Akademisyen("Ahmet Yaman","123456677","ymna@gmail.com", "CE", "Akademisyen");

        //Memur m1 = new Memur("Ali Yavuz", "05783495357", "a@gmail.com", "ENG","09.00-18.00");

        OgretimGorevlisi o1 = new OgretimGorevlisi("Ulaş Ma","5432625327", "ulas@sni.net","CivilE", "Prof", "102");

        Asistan aa1 = new Asistan("Mahmut Yılmaz", "=555544654", "w@ddd.com", "Turkce", "Asistan", "10.00-12.00");

        LabAsistani la1 = new LabAsistani("Faruk Gül", "04562534782384", "faruk@sni.tech", "İktisat", "Asistan", "9-16");

        BilgiIslem b1 = new BilgiIslem("Ali Tam", "053485378", "yy@gmail.com", "Beden", "12-17", "Reset");

        GuvenlikGorevlisi gg1 = new GuvenlikGorevlisi("Ramazan Veli", "0532446", "a@ty.com", "IT", "09.00-17.00","Silah Kullanma");

        //Calisan a2 = new Akademisyen("Kodluyoruz", "123456677","ymna@gmail.com", "CE", "Akademisyen");

        // Polimorfizm (Çok Biçimlilik)
        // int[] loginUser = new int[5];
        //Calisan[] loginUser = {c1, a1, m1, o1};
        //Calisan.girisYapanlar(loginUser);

        o1.derseGir("10.00");

        Memur asd = new GuvenlikGorevlisi("Ramazan Veli", "0532446", "a@ty.com", "IT", "09.00-17.00","Silah Kullanma");
        GuvenlikGorevlisi guvenlikGorevlisi = (GuvenlikGorevlisi) asd;
        gg1.nobet();
        System.out.println(asd instanceof Memur);
        System.out.println(asd instanceof Memur);


    }
}