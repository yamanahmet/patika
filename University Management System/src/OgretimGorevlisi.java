public class OgretimGorevlisi extends Akademisyen{
    private String kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo){
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public void senatoToplanti(){
        System.out.println(this.getAdSoyad() + " senato toplandı!!");
    }

    public void sinavYap(){
        System.out.println(this.getAdSoyad() + " öğretim görevlisi sınavi yaptı");
    }

    @Override
    public String getAdSoyad(){
        return super.getAdSoyad();
    }

    @Override
    public void derseGir(String dersSaati){
        System.out.println(this.getAdSoyad() + " öğretim görevlisi derse " + dersSaati + " giriş yaptı.");
    }

}
