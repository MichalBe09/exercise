package Powtórka.Pętle;

import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        System.out.println("Wprowadź wyraz:");
        Scanner odczyt = new Scanner(System.in);
        String word = odczyt.next();
        for (int i = 0; i < word.length() ; i++) {
            if (Character.isDigit(word.charAt(i))){
                System.out.println(word.charAt(i));
            }

        }
    }
}
