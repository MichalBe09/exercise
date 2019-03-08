package Powtórka.String;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        String pas = "";
        while (!pas.equals("Akademia")) {
            System.out.println("Wprowadź słowo");
            Scanner password = new Scanner(System.in);
            pas = password.next();
            if (!pas.equals("Akademia")){
                System.out.println("CHUJU KURWA"); }
        }
        System.out.println("Dobre hasło");
    }
}


