package LAB1.ex3;

import java.util.Scanner;

public class lab1_ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numar = sc.nextInt();
        int i=2;
        int nr=0;
        while(i<=numar/2)
        {
            if(numar%i==0)
            {
                System.out.println(i);

                nr++;
            }

            i++;
        }

        if(nr==0)
        {
            System.out.println("e nr prim la baza are ca  diviori" + 1 + numar);
        }
    }
}
