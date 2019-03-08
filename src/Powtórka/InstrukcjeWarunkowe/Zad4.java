package Powtórka.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        System.out.println("Wprowadź imię:");
        Scanner odczyt = new Scanner(System.in);
        String name = odczyt.next().toLowerCase();
        if (name.equalsIgnoreCase("kuba")){
            System.out.println("To jest imię męskie");
        }else if (name.equalsIgnoreCase("maria")){
            System.out.println("To jest imię męskie i żeńskie");
        }else if (name.endsWith("a")){
            System.out.println("To jest imię żeńskie");
        }else {
            System.out.println("To jest imię męskie");
        }
    }
}
