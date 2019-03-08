package Powtórka.Pętle;

import java.util.Random;
import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(600);
        int g = 0;
        System.out.println("Zgadnij liczbę!");
        while (g != n) {
            Scanner odczyt = new Scanner(System.in);
            g = odczyt.nextInt();
            if (g > n) {
                System.out.println("Podałeś zbyt dużą liczbę!");
            } else if (g < n) {
                System.out.println("Podałeś zbyt małą liczbę!");
            }else {
                System.out.println("Zgadłeś!");
                break;
            }
        }

    }
}
