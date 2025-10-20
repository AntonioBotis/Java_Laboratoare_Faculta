package LAB4.ex1;

public class Sisteme extends Electronice {

    private String tip_mon;
    private int vit_proc;
    private int c_hdd;
    private SistemOperare os;

    public enum SistemOperare {
        Windows,
        Linux
    }
    public Sisteme(String denumire, int nr_inv, int pret, expunere_magazin zona_mag, String tip_mon,int vit_proc,int c_hdd,SistemOperare os)
    {
        super(denumire, nr_inv, pret, zona_mag);
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.os = os;

    }
    @Override
    public String toString() {
        return "Sisteme" + super.toString() +
                " [tip monitor" + tip_mon + ", viteza procesor=" + vit_proc + ", capacitate hdd=" + c_hdd + ", Sistem operare=" + os + "]";
    }

}
