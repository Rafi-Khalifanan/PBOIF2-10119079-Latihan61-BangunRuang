package pboif2.pkg10119079.latihan61.bangunruang;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan61BangunRuang {
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setJariJari(7);
        System.out.printf("Hasil : V = %.1f cm^3 \n", bola.volume());
        
        Tabung tabung = new Tabung();
        tabung.setJariJari(10);
        tabung.setTinggi(21);
        System.out.printf("Hasil : V = %.0f cm^3 \n", tabung.volume());
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJariJari(14);
        kerucut.setTinggi(9);
        System.out.printf("Hasil : V = %.0f cm^3 \n", kerucut.volume());
        
    }
    
}