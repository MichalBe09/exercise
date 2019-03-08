package Powtórka.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        System.out.println("Wpisz wyraz:");
        Scanner odczyt = new Scanner(System.in);
        String word = odczyt.next().toLowerCase();
        if (word.endsWith("m")){
            System.out.println("Wyraz kończy się na M");
        }else {
            System.out.println("Wyraz nie kończy się na M");
        }
    }

//    public static void main(String[] args) {
//        System.out.println("Wpisz wyraz:");
//        Scanner odczyt = new Scanner(System.in);
//        String word = odczyt.next().toLowerCase();
//        boolean isTrue = word.endsWith("m");
//        System.out.println(isTrue);
//
//
//    }
}
