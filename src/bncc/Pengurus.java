package bncc;

// member -> aktivis -> pengurus
public class Pengurus extends Aktivis {

    public Pengurus(String nama, String nim, String email) {
        super(nama, nim, email);
    }

    public void buatAcara(String namaAcara) {
        System.out.println(this.getNama() + " membuat acara " + namaAcara);
    }

    public void bimbingAktivis(Aktivis aktivis) {
        System.out.println(this.getNama() + " membimbing seorang aktivis bernama " + aktivis.getNama());
    }

    @Override
    public void chat(String message) {
        System.out.println("[Pengurus] " + getNama() + ": " + message);
    }

}
