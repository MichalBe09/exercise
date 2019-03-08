package Powtórka.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad1 {
//    public static void main(String[] args) {
//        System.out.println("Wprowadź liczbę");
//        Scanner odczyt = new Scanner(System.in);
//        double digit = odczyt.nextDouble();
//        if (digit >5){
//            System.out.println("Liczba jest większa 5");
//        }else {
//            System.out.println("Liczba nie jest większa od 5");
//        }
//    }


    public static void main(String[] args) {
        System.out.println("Wprowadź liczbę");
        Scanner odczyt = new Scanner(System.in);
        double digit = odczyt.nextDouble();
        boolean bigger = digit >5;
        System.out.println(bigger);
        }
    }

