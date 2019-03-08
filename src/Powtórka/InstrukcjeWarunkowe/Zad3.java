package Powtórka.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad3 {
//    public static void main(String[] args) {
//        System.out.println("Wprowadź wyraz:");
//        Scanner odczyt = new Scanner(System.in);
//        String pass = odczyt.next();
//        if (pass.equalsIgnoreCase("Akademia")){
//            System.out.println("To jest poprawny wyraz");
//        }else {
//            System.out.println("To nie jest poprawny wyraz");
//        }
//    }


    public static void main(String[] args) {
        System.out.println("Wprowadź wyraz:");
        Scanner odczyt = new Scanner(System.in);
        String pass = odczyt.next();
        boolean isOk = pass.equalsIgnoreCase("Akademia");
       System.out.println(isOk);
    }
}
