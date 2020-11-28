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
public abstract class BangunRuang {
    
    protected int jariJari;
    
    public void setJariJari(int jariJari){
        this.jariJari =jariJari;
    }
    
    public abstract double volume();
}
