package Powtórka.zmienne;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner odczyt = new Scanner(System.in);
        int digit = odczyt.nextInt();
        System.out.println("Ostatnia cyfra to: "+digit % 10);
    }
}
