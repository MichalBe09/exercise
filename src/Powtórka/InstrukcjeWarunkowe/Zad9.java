package Powtórka.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad9 {
//    public static void main(String[] args) {
//        System.out.println("Wprowadź pierwszy wyraz:");
//        Scanner odczyt = new Scanner(System.in);
//        String word1 = odczyt.next().toLowerCase();
//        System.out.println("Wprowaź drugi wyraz:");
//        String word2 = odczyt.next().toLowerCase();
//        if (word1.equalsIgnoreCase(word2)){
//            System.out.println("Wyrazy są takie same");
//        }else {
//            System.out.println("Wyrazy nie są takie same");
//        }
//    }

    public static void main(String[] args) {
        System.out.println("Wprowadź pierwszy wyraz:");
        Scanner odczyt = new Scanner(System.in);
        String word1 = odczyt.next().toLowerCase();
        System.out.println("Wprowaź drugi wyraz:");
        String word2 = odczyt.next().toLowerCase();
        boolean areeq = word1.equalsIgnoreCase(word2);
        System.out.println(areeq);
        }
    }

