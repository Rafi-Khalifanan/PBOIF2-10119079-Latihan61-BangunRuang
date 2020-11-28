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
public class Kerucut extends BangunRuang{
    private int tinggi;
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume(){
        double volume = ((Math.PI * Math.pow(jariJari, 2)) * tinggi) / 3;
        return volume;
    }
    
    
}