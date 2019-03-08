package Powtórka.Pętle;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        System.out.println("Wprowadź liczbę");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int n= scanner.nextInt();

        System.out.println("twoje liczby to :");
        for (int i = 1; i <n; i++) {
            System.out.println( i);

        }
        int result =n*(n-1)/2 + n ;
        System.out.println("suma liczb od 1 do podanej przez ciebie liczby to: " + result);
            
        }

    }

