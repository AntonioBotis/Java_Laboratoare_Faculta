package LAB1.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class lab1_ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        String numeFisier="src/LAB1/ex2/judete_in.txt";
        File fisier=new File(numeFisier);
        Scanner sc=new Scanner(fisier);



        int numar = sc.nextInt();

        float ma=numar;
        int valMax=numar;
        int valMin=numar;
        int lungimea=1;

        while (sc.hasNextLine()) {
            lungimea++;
            numar = sc.nextInt();
            ma+=numar;
            valMax=numar > valMax ? numar : valMax;
            valMin=numar < valMin ? numar : valMin;
        }
        String outFisier = "src/LAB1/ex2/out.txt";


        try {
            PrintWriter writer = new PrintWriter(outFisier);
            writer.println("suma este "+ma);
            writer.println("media artimetica este "+ma/lungimea);
            writer.println("val max este "+valMax);
            writer.println("val min este "+valMin);
            writer.close();



        } catch (FileNotFoundException e) {
            System.out.println("Eroare: Nu s-a putut scrie in fisierul " + numeFisier);
            e.printStackTrace();
        }
    }
}
