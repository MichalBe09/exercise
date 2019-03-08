package Powtórka.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad2 {
//    public static void main(String[] args) {
//        System.out.println("Wprowadź liczbę");
//        Scanner odczyt = new Scanner(System.in);
//        double digit = odczyt.nextDouble();
//        if (digit % 3 == 0){
//            System.out.println("Liczba jest podzielna przez 3");
//        }else {
//            System.out.println("Liczba nie jest podzielna przez 3");
//        }
//    }

    public static void main(String[] args) {
        System.out.println("Wprowadź liczbę");
        Scanner odczyt = new Scanner(System.in);
        double digit = odczyt.nextDouble();
        boolean isdiv = digit % 3 == 0;
        System.out.println(isdiv);


        }
    }
