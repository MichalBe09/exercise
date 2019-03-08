package Powtórka.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad12 {
//    public static void main(String[] args) {
//        System.out.println("Wprowadź kod pocztowy:");
//        Scanner odczyt = new Scanner(System.in);
//        String kod = odczyt.next();
//        if (kod.length()== 6 && kod.charAt(2) == '-'){
//            System.out.println("To jest poprawny kod pocztowy");
//        }else {
//            System.out.println("To nie jest poprawny kod pocztowy");
//        }
//
//    }

    public static void main(String[] args) {
        System.out.println("Wprowadź kod pocztowy:");
        Scanner odczyt = new Scanner(System.in);
        String kod = odczyt.next();
        boolean isok = (kod.length() == 6 && kod.charAt(2) == '-');
        System.out.println(isok);
    }
}