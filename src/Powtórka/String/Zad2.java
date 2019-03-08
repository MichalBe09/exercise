package Powtórka.String;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        String nam;
        System.out.println("Wprowadź imię");
        Scanner name = new Scanner(System.in);
        nam = name.next();
        System.out.println(nam.length());
    }
}
