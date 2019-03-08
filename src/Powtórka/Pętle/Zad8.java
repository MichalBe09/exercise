package Powtórka.Pętle;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        System.out.println("Podaj hasło");
        String pas = "";
        while (!pas.equals("Polska")){
            Scanner odczyt = new Scanner(System.in);
            String pass = odczyt.next();
            pas = pass;
            if (!pas.equals("Polska")){
                System.out.println("Podałeś niepoprawne hasło");
            }else {
                System.out.println("Poprawne hasło");
                break;
            }
        }
    }
}
