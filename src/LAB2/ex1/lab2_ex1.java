package LAB2.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class lab2_ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        File fisier = new File("src/LAB2/ex1/judete_in.txt");
        Scanner sc = new Scanner(fisier);
        Scanner scanner = new Scanner(System.in);
        String[] cities = new String[20];
        int i = 0;

        while (sc.hasNextLine()) {
            String city = sc.nextLine();
            cities[i] = city;
            i++;
        }
        sc.close();
        Arrays.sort(cities, 0, i);

        for (int j = 0; j < i; j++)
            System.out.println(cities[j]);

        System.out.println("introduceti un oras de la tastatura:");
        String cityName=scanner.nextLine();

        cityName = cityName.substring(0, 1).toUpperCase() + cityName.substring(1);
        System.out.println(cityName);

        int rezult = Arrays.binarySearch(cities, 0, i, cityName);
        System.out.println(
                rezult >=0 ? rezult+" este pozitia orasului in array" : "nu exista"
        );


    }
}
