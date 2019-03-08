package Powtórka.Wejściówka;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        System.out.println("Wpisz słowo:");
        Scanner odczyt = new Scanner(System.in);
        String word = odczyt.next().toLowerCase();
        StringBuilder w2 = new StringBuilder(word);
        StringBuilder rev = w2.reverse();
        System.out.println(word+" Odwrócone to: "+rev);


    }
}
