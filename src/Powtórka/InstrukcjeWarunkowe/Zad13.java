package Powtórka.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        System.out.println("Wprowadź liczbę:");
        Scanner odczyt = new Scanner(System.in);
        int digit = odczyt.nextInt();
        if (digit % 3 == 0 && digit % 5 == 0){
            System.out.println(digit+" jest podzielne przez 3, oraz przez 5");
        }else if (digit % 5 == 0 ){
            System.out.println(digit+" jest podzielne przez 5");
        }else if (digit % 3 == 0 ){
            System.out.println(digit+" jest podzielne przez 3");
        }else {
            System.out.println(digit+" nie jest podzielne ani przez 3, ani przez 5");
        }
    }
}
