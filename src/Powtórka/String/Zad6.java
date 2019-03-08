package Powtórka.String;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        System.out.println("Wprowadź słowo");
        Scanner odczyt = new Scanner(System.in);
        String word = odczyt.next().toLowerCase();
        boolean tak = word.contains("kot");
        System.out.println(tak);

    }
}
