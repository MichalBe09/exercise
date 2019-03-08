package Powtórka.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad15 {
//    public static void main(String[] args) {
//        System.out.println("Wprowadź pierwszą liczbę:");
//        Scanner odczyt = new Scanner(System.in);
//        int a = odczyt.nextInt();
//        System.out.println("Wprowadź drugą liczbę:");
//        int b = odczyt.nextInt();
//        System.out.println("Wprowadź trzecią liczbę:");
//        int c = odczyt.nextInt();
//        if (a + b == c){
//            System.out.println("Liczba "+c+" jest sumą otrzymaną z liczb "+a+" oraz "+b);
//        }else if (b + c == a){
//            System.out.println("Liczba "+a+" jest sumą otrzymaną z liczb "+b+" oraz "+c);
//        }else if (a + c == b){
//            System.out.println("Liczba "+b+" jest sumą otrzymaną z liczb "+a+" oraz"+c);
//        }else {
//            System.out.println("Otrzymanie sumy nie jest możliwe");
//        }
//    }
public static void main(String[] args) {
    System.out.println("Wprowadź pierwszą liczbę:");
    Scanner odczyt = new Scanner(System.in);
    int a = odczyt.nextInt();
    System.out.println("Wprowadź drugą liczbę:");
    int b = odczyt.nextInt();
    System.out.println("Wprowadź trzecią liczbę:");
    int c = odczyt.nextInt();
    boolean ispos = a+b==c || a+c==b || b+c==a;
    System.out.println(ispos);
    }
}

