package Powtórka.Metody;

import java.util.Scanner;

public class Zad1 {
    static int add(int a, int b) {
        return a+b;
    }


    public static void main(String[] args) {
        System.out.println("Podaj liczby");
        Scanner odczyt = new Scanner(System.in);
        int a = odczyt.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = odczyt.nextInt();
        System.out.println("Suma liczb to: "+add(a,b));

    }


}