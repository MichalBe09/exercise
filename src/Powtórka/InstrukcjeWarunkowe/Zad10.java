package Powtórka.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad10 {
//    public static void main(String[] args) {
//        System.out.println("Wprowadź adres URL");
//        Scanner odczyt = new Scanner(System.in);
//        String url = odczyt.next().toLowerCase();
//        if (url.startsWith("www.") || url.startsWith("http://") || url.startsWith("https://")){
//            System.out.println("To jest poprawny adres url");
//        }else {
//            System.out.println("To nie jest poprawny adres url");
//        }
//    }

    public static void main(String[] args) {
        System.out.println("Wprowadź adres URL");
        Scanner odczyt = new Scanner(System.in);
        String url = odczyt.next().toLowerCase();
        boolean isulr = (url.startsWith("www.") || url.startsWith("http://") || url.startsWith("https://"));
        System.out.println(isulr);
    }




}
