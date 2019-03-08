package Powtórka.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad11 {
//    public static void main(String[] args) {
//        System.out.println("Wprowadź słowo:");
//        Scanner odczyt = new Scanner(System.in);
//        String word = odczyt.nextLine().toLowerCase();
//        if (word.contains("kajak")){
//            System.out.println("Zdanie zawiera słowo kajak");
//        }else {
//            System.out.println("Zdanie nie zawiera słowa kajak");
//        }
//    }

    public static void main(String[] args) {
        System.out.println("Wprowadź słowo:");
        Scanner odczyt = new Scanner(System.in);
        String word = odczyt.nextLine().toLowerCase();
        boolean cont = word.contains("kajak");
        System.out.println(cont);
    }
}