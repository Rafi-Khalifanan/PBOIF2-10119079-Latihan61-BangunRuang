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
public class Bola extends BangunRuang{
    @Override
    public double volume(){
        double volume = (Math.PI * Math.pow(jariJari, 3) * 4/3);
        return volume;
    }
}