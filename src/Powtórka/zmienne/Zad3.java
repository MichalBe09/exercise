package Powtórka.zmienne;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner odczyt = new Scanner(System.in);
        double digit = odczyt.nextDouble();
        System.out.println("Pierwiastek podanej liczby to: "+Math.sqrt(digit));
    }
}
