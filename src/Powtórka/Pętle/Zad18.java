package Powtórka.Pętle;

import java.util.Scanner;

public class Zad18 {
    public static void main(String[] args) {
        System.out.println("Podaj pierwszą liczbę:");
        Scanner odczyt = new Scanner(System.in);
        int d1 = odczyt.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int d2 = odczyt.nextInt();
        int counter = 0;
        for (int i = 1; i <= d1 && i<= d2 ; i++) {
            if (d1%i==d2%i) {
                counter =i;

            }

        }
        System.out.println(counter);
    }
}
