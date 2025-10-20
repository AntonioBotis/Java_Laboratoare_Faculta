package LAB4.ex1;

import com.sun.tools.javac.Main;

public class Imprimante extends Electronice {

private int ppm;
private int dpi;
private int p_car;
private tip modul;

public enum tip{
    color,
    alb
}
    public Imprimante(String denumire, int nr_inv, int pret, expunere_magazin zona_mag,
                      int ppm, int dpi, int p_car, tip modul)
    {
        super(denumire, nr_inv, pret, zona_mag);
        this.ppm = ppm;
        this.dpi = dpi;
        this.p_car = p_car;
        this.modul = modul;
    }
    @Override
    public String toString() {
        return "Imprimanta " + super.toString() +
                " [ppm=" + ppm + ", dpi=" + dpi + ", p_car=" + p_car + ", modul=" + modul + "]";
    }

}
