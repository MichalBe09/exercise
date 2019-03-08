package Powtórka.Pętle;

import java.util.Scanner;

public class Zad9 {
    public static int silnia (int n){
        if (n < 1)
            return 1;
        else return n*silnia(n-1);
    }


    public static void main(String[] args) {
        int n;

        System.out.println("Podaj dla jakiej liczby obliczyc silnie.\n");
        Scanner odczyt = new Scanner(System.in);
        n = odczyt.nextInt();
        System.out.println(n + "! = " +  silnia(n));

    }
}
