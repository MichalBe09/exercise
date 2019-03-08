package Powtórka.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        System.out.println("Wpisz wyraz:");
        Scanner odczyt = new Scanner(System.in);
        String word = odczyt.next().toLowerCase();
        if (word.charAt(0) == word.charAt(word.length()-1)){
            System.out.println("Pierwsza i ostatnia litera są takie same");
        }else {
            System.out.println("Pierwsza i ostatnia litera nie są takie same");
        }
    }

//    public static void main(String[] args) {
//        System.out.println("Wpisz wyraz:");
//        Scanner odczyt = new Scanner(System.in);
//        String word = odczyt.next().toLowerCase();
//        boolean equal = word.charAt(0) == word.charAt(word.length()-1);
//        System.out.println(equal);
//
//
//    }
}