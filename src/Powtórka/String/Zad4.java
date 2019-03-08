package Powtórka.String;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        System.out.println("Wprowadź wyraz");
        Scanner odczyt = new Scanner(System.in);
        String word = odczyt.next().toUpperCase();
        System.out.println("Twój wyraz to : "+word);

    }
}
