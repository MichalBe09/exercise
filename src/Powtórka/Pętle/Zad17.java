package Powtórka.Pętle;

import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {
        System.out.println("Podaj imię:");
        Scanner odczyt = new Scanner(System.in);
        String name = odczyt.next();
        for (int i = 0; i < name.length() ; i+=2) {
            System.out.println(name.charAt(i));

        }

    }
}
