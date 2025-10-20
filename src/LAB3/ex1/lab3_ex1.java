package LAB3.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab3_ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        File Fisier = new File("src/LAB3/ex1/in.txt");
        Scanner sc = new Scanner(Fisier);

        List<Parabola> parabolas = new ArrayList<Parabola>();

        parabolas.add(new Parabola(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        parabolas.add(new Parabola(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        parabolas.add(new Parabola(sc.nextInt(), sc.nextInt(), sc.nextInt()));

        for (Parabola p : parabolas) {
            System.out.println(p);
        }

        Parabola aux = parabolas.get(0);

        //varf
        aux.Varf(1, -4, 3);


        //coord mijloc
        Parabola.CoordonateMjiloc(parabolas.get(0), parabolas.get(1));

        //lungime de la parabola curenta la parabola paramentru
        System.out.println(aux.lungimeaSegmentului(parabolas.get(1)));

        //
        System.out.println(Parabola.distantaIntre(aux,parabolas.get(2)));



    }
}
