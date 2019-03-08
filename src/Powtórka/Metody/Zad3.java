package Powtórka.Metody;

import java.util.Scanner;

public class Zad3 {
    static int multiply (int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Wpisz pierwszą liczbę:");
        int a = odczyt.nextInt();
        System.out.println("Wpisz drugą liczbę:");
        int b = odczyt.nextInt();
        System.out.println("Wynik mnożenia to: "+multiply(a,b));
    }
}
