package Powtórka.String;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        String name;
        System.out.println("Wprowadź imię");
        Scanner odczyt = new Scanner(System.in);
        name = odczyt.next().toLowerCase();
        if (name.startsWith("a")){
            System.out.println("Wyraz zaczyna się na literę A");
        }else System.out.println("Wyraz nie zaczyna się na literę A");

    }

}
