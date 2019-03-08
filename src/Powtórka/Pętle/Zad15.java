package Powtórka.Pętle;

import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        System.out.println("Wpisz wyraz:");
        Scanner odczyt = new Scanner(System.in);
        String w1 = odczyt.next();
        String w2 = new StringBuilder(w1).reverse().toString().toLowerCase();
        System.out.println("Twój wyraz odwrócony to: "+w2);

    }
}
