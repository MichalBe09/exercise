package Powtórka.Pętle;

import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        System.out.println("Wprowadź wyraz:");
        Scanner odczyt = new Scanner(System.in);
        String word = odczyt.next();
        int counter = 0;
        for (int i = 0; i < word.length() ; i++) {
            if (Character.isLowerCase(word.charAt(i))){
                counter++;


            }
        }System.out.println(counter);
    }
}
