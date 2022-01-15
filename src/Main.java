import bncc.Aktivis;
import bncc.Member;
import bncc.Pengurus;
import menu.AbstractMenu;
import menu.CloseableMenu;
import menu.MainMenu;

public class Main {

    public Main() {
        Member gafi = new Member("Gafi", "274", "gafi@binus.ac.id");
//        gafi.ikutAcara("CSR 2021");
//        gafi.chat("halo semuanya");

        Aktivis calvin = new Aktivis("Calvin", "254", "calvin@binus.ac.id");
//        calvin.chat("salam dari binjay");
//        calvin.ikutAcara("CSR");
//        calvin.ikutPanitiaAcara("Techbinar");

        Pengurus jeselyn = new Pengurus("Jeselyn", "250", "jesely@binus.ac.id");

        gafi.chat("halo guys");
        calvin.chat("halo apa kabar?");
        jeselyn.chat("baik, calvin yok belajar java");
        gafi.chat("gw gk diajak gitu?");

//        jeselyn.buatAcara("Webinar");
//        jeselyn.bimbingAktivis(calvin);
//        jeselyn.chat("kita belajar java yok");

//        gafi.setNama("Alvian");
//        System.out.println(gafi.getEmail());

//        Member[] allMembers = {calvin, gafi, jeselyn};
//
//        for (Member member : allMembers) {
//            // check jika pengurus, buat acara
//            // instanceof
//            if (member instanceof Pengurus) {
//                ((Pengurus) member).buatAcara("Techbinar");
//            } else if (member instanceof Aktivis) {
//                Aktivis aktivis = (Aktivis) member;
//                aktivis.ikutPanitiaAcara("Techbinar");
//            } else {
//                member.ikutKelasLnT("Java");
//            }
//
//            // jika aktivis ikut panitia
//            // member chat
//        }

//        System.out.println(sum(1, 2));
//        System.out.println(sum(1, 2, 3));

        MainMenu menu = new MainMenu("hello");
        menu.showMenu();

        if (menu instanceof CloseableMenu) {
            System.out.println("Menu ini bisa ditutup");
        }
    }

//    int sum(int a, int b) {
//        return a + b;
//    }
//
//    int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    String sum(String a, String b) {
//        return a + b;
//    }

//    String sum(int a, String b) {
//        return a + b;
//    }
//
//    String sum(String a, int b) {
//        return a + b;
//    }
//
//    String sum(String a, String b) {
//        return a + b;
//    }

    public static void main(String[] args) {
        new Main();
    }

}
