package Powtórka.zmienne;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        System.out.println("Podaj wyraz");
        Scanner odczyt = new Scanner(System.in);
        String sent = odczyt.next();
        System.out.println("Dwie pierwsze litery to: "+sent.charAt(0)+" , "+sent.charAt(1));

    }
}
