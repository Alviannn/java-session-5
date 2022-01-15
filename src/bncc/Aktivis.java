package bncc;

public class Aktivis extends Member {

    public Aktivis(String nama, String nim, String email) {
        super(nama, nim, email);
    }

    public void ikutPanitiaAcara(String namaAcara) {
        System.out.println(this.getNama() + " menjadi panitia di acara " + namaAcara);
    }

    @Override
    public void chat(String message) {
        System.out.println("[Aktivis] " + getNama() + ": " + message);
    }

}
