package Powtórka.Metody;

import java.util.Scanner;

public class Zad2 {
    static int roznica (int a, int b){
        return a-b;
    }


    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        int a = odczyt.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int b = odczyt.nextInt();
        System.out.println("Różnica podanych liczb to: "+roznica(a,b));
    }
}
