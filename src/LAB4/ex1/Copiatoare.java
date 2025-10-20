package LAB4.ex1;


public class Copiatoare extends Electronice {
    private int p_ton;
    private FormatCopiere format; // enum A3 / A4

    public Copiatoare(String denumire, int nr_inv, int pret, expunere_magazin zona_mag,
                    int p_ton, FormatCopiere format) {
        super(denumire, nr_inv, pret, zona_mag);
        this.p_ton = p_ton;
        this.format = format;
    }

    public enum FormatCopiere {
        A3,
        A4
    }

    @Override
    public String toString() {
        return "Copiator " + super.toString() +
                " [p_ton=" + p_ton + ", format=" + format + "]";
    }
}