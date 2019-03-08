package Powtórka.Metody;

import java.util.Scanner;

public class Zad4 {
    static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Nie można dzielić przez 0!");
            return 0;
        }
        else return a / b;
    }

    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Wpisz pierwszą liczbę:");
        int a = odczyt.nextInt();
        System.out.println("Wpisz drugą liczbę: ");
        int b = odczyt.nextInt();
        System.out.println("Wynik dzielenia to: "+divide(a,b));
    }
}
