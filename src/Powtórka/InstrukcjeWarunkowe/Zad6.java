package Powtórka.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        System.out.println("Wprowadź pierwszą liczbę:");
        Scanner odczyt = new Scanner(System.in);
        int a = odczyt.nextInt();
        System.out.println("Wprowadź drugą liczbę:");
        int b = odczyt.nextInt();
        System.out.println("Wprowadź trzecią liczbę:");
        int c = odczyt.nextInt();
        if (a<b && a<c){
            System.out.println("Najmniejsza liczba to liczba nr. 1 : "+a);
        }else if (b<a && b<c){
            System.out.println("Najmniejsza liczba to liczba nr.2 : "+b);
        }else {
            System.out.println("Najmniejsza liczba to liczba nr.3 : "+c);
        }
    }
}