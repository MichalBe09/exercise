package Powtórka.Metody;

import java.util.Scanner;

public class Zad6 {

    static boolean isEven ( int a){
        if (a%2==0){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner odczyt = new Scanner(System.in);
        int a = odczyt.nextInt();
        System.out.println(isEven(a));
    }

}
