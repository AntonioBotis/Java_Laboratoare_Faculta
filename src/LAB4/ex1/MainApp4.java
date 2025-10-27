package LAB4.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp4 {

    public static int DeterminareEchipament(String denumire){
        String aux=denumire.split(" ")[0];

        if(aux.equals("Imprimanta"))
            return 0;
        else if(aux.equals("Copiator"))
            return 1;
        else
            return 2;
    }
    public static void CitireEchipamente() throws FileNotFoundException {
        File fisier =new File("src/LAB4/ex1/in.txt");
        Scanner sc = new Scanner(fisier);

       while(sc.hasNextLine()){
           String denumire = sc.next();
           if(DeterminareEchipament(denumire) == 0){
               Imprimante i1 = new Imprimante(denumire, sc.nextInt(), sc.nextInt(), Electronice.expunere_magazin.achizitionat, 20, 1200, 500, Imprimante.tip.alb);


           }

       }



    }

    public static void AfisareEchipamente(List<Electronice> arr)
    {
        for(Electronice e:arr)
        System.out.println(e);
    }

    public static void main(String[] args) {
        List<Electronice> lista = new ArrayList<Electronice>();
        Imprimante i1 = new Imprimante("HP LaserJet", 101, 950, Electronice.expunere_magazin.achizitionat, 20, 1200, 500, Imprimante.tip.alb);
        Copiatoare c1 = new Copiatoare("Canon X200", 202, 1500, Electronice.expunere_magazin.expus, 3000, Copiatoare.FormatCopiere.A3);
        lista.add(c1);
        lista.add(i1);
        System.out.println(lista);

        int opt = 0;

        do {
            System.out.println("1 Afişarea tuturor echipamentelor\n" +
                    "2 Afişarea imprimantelor\n" +
                    "3 Afişarea copiatoarelor\n" +
                    "4 Afişarea sistemelor de calcul\n" +
                    "5 Modificarea stării în care se află un echipament\n" +
                    "6 Setarea unui anumit mod de scriere pentru o imprimantă\n" +
                    "7 Setarea unui format de copiere pentru copiatoare\n" +
                    "8 Instalarea unui anumit sistem de operare pe un sistem de calcul\n" +
                    "9 Afişarea echipamentelor vândute\n" +
                    "10 Să se realizeze două metode statice pentru serializarea / deserializarea colecției de" +
                    "obiecte în fișierul echip.bin \n" +
                    "\n" +
                    "Alegeti optiunea dvs=");

            Scanner sc = new Scanner(System.in);

            opt = sc.nextInt();
            System.out.println("\n\n\n");


            switch (opt) {
                case 0:
                    AfisareEchipamente(lista);
                    break;
                case 1:
                    System.out.println(lista);
                    System.out.println("\n\n\n");
                    break;
                case 2:
                    for (Electronice e : lista) {
                        if (e instanceof Imprimante) {
                            System.out.println(e);
                            System.out.println("\n\n\n");
                        }
                    }break;
                case 3:
                    for (Electronice e : lista) {
                        if (e instanceof Copiatoare) {
                            System.out.println(e);
                            System.out.println("\n\n\n");
                        }
                    }break;
                case 4:
                    for (Electronice e : lista) {
                        if (e instanceof Sisteme) {
                            System.out.println(e);
                            System.out.println("\n\n\n");
                        }
                    }break;
                case 5:
                    for (Electronice e : lista)
                        if (e instanceof Imprimante){
                        {

                            System.out.println("selectati care element doriti sa ii schimbati starea 0-"+ lista.size());
                            int indexElement=sc.nextInt();
                            System.out.println("in ce stare doriti sa schimbati ? 0-achiztionat, 1-expus, 2-vandut");
                            int stare=sc.nextInt();
                            Electronice aux= lista.get(indexElement);
                            if(stare==0){
                               aux.zona_mag=Electronice.expunere_magazin.achizitionat;
                            }
                            else if(stare==1){
                                aux.zona_mag=Electronice.expunere_magazin.expus;

                            }
                            else if(stare==2){
                                aux.zona_mag=Electronice.expunere_magazin.vandut;
                            }
                            lista.set(indexElement, aux);
                            System.out.println(lista.get(indexElement));
                            System.out.println("\n\n\n");

                        }
                    }
                    break;
                case 6:


                    break;



            }

        } while (opt != 0);
    }
}
