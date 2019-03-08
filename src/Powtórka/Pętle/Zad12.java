package Powtórka.Pętle;

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        System.out.println("Wpisz wyraz:");
        Scanner odczyt = new Scanner(System.in);
        String w1 = odczyt.next().toLowerCase();
        StringBuilder w2 = new StringBuilder(w1);
        StringBuilder rev = w2.reverse();
        System.out.println(w1);
        System.out.println(w2);
        if (w1.equals(w2.toString())){
            System.out.println("Wyraz jest palindromem");
        }else {
            System.out.println("Wyraz nie jest palindromem");
        }

    }
}
