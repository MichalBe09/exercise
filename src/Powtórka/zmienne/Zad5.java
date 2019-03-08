package Powtórka.zmienne;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        int n, reverse = 0;
        System.out.println("Podaj liczbę");
        Scanner odczyt = new Scanner(System.in);
        n = odczyt.nextInt();

        while (n != 0){
            reverse = reverse *10;
            reverse = reverse +n % 10;
            n = n/10;
        }

        System.out.println("Odwrócona liczba to: "+reverse);













    }
}
