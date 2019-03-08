package Powtórka.zmienne;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        System.out.println("Podaj pierwszą liczbę");
        Scanner odczyt = new Scanner(System.in);
        double digit1 = odczyt.nextInt();
        System.out.println("Podaj drugą liczbę");
        Scanner odczyt2 = new Scanner(System.in);
        double digit2 = odczyt2.nextDouble();
        double result = (digit1+digit2)/2;
        System.out.println("Średnia liczb to: "+result);
    }
}
