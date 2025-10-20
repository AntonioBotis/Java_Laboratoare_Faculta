package LAB2.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab2_ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        File fisier = new File("src/LAB2/ex2/cantec_in.txt");
        Scanner sc = new Scanner(fisier);

        while (sc.hasNextLine()) {
            Vers fileVerse=new Vers();
            fileVerse.Verse=sc.nextLine();
            System.out.println(fileVerse.Verse+" "+ fileVerse.Words(fileVerse.Verse) +" "+fileVerse.Vocals(fileVerse.Verse));
        }
    }
}
