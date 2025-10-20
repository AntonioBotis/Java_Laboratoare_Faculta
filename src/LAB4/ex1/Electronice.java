package LAB4.ex1;

public abstract class Electronice {
    private String denumire ;
    private int nr_inv;
    private int pret;
    public expunere_magazin zona_mag;
    public enum expunere_magazin{
        achizitionat,
        expus,
        vandut
    }


    public Electronice(String denumire, int nr_inv, int pret, expunere_magazin zona_mag) {
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
    }
    @Override
    public String toString() {
        return denumire + " (inv: " + nr_inv + ", pret: " + pret + " lei, zona: " + zona_mag;
    }

}
