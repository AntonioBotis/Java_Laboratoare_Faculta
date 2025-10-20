package LAB3.ex1;

public class Parabola {
    private final int a;
    private final int b;
    private final int c;

    public Parabola(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String toString() {
        if(a!=1)
            return "f(x)=" + a + "x^2+" + b + "x+" + c ;
        else
            return "f(x)=x^2+" + b + "x+" + c ;
    }

    public void Varf(int a, int b, int c) {
        int x=-b/2*a;
        int y=-(b^2+4*a*c)/4*a;
        System.out.println("x="+x+" y="+y);

    }

    public static void CoordonateMjiloc(Parabola par1,Parabola par2) {
        int x=(par1.a*par2.a)/2;
        int y=(par1.b*par2.b)/2;

        System.out.println("(" + x + "," + y + ")");
    }

    public double[] getVertex() {
        double xv = - (double)b / (2 * a);
        double yv = (-Math.pow(b, 2) + 4.0 * a * c) / (4.0 * a);
        return new double[]{xv, yv};
    }


    public double lungimeaSegmentului(Parabola alta) {
        double[] v1 = this.getVertex();
        double[] v2 = alta.getVertex();
        return Math.hypot(v1[0] - v2[0], v1[1] - v2[1]);
    }


    public static double distantaIntre(Parabola p1, Parabola p2) {
        double[] v1 = p1.getVertex();
        double[] v2 = p2.getVertex();
        return Math.hypot(v1[0] - v2[0], v1[1] - v2[1]);
    }
}
