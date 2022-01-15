package bncc;

public class Member {

    private String nama;
    private String nim;
    private String email;

    public Member(String nama, String nim, String email) {
        this.nama = nama;
        this.nim = nim;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void ikutKelasLnT(String namaKelas) {
        System.out.println(nama + " mengikuti kelas LnT " + namaKelas);
    }

    public void ikutAcara(String namaAcara) {
        System.out.println(nama + " mengikuti acara " + namaAcara);
    }

    public void chat(String message) {
        System.out.println("[Member] " + nama + ": " + message);
    }

    public void changeEmail(String email) {
        this.email = email;
    }

}
