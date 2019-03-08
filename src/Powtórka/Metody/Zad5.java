package Powtórka.Metody;

import java.util.Scanner;

public class Zad5 {
    static boolean pita (int a, int b, int c){
        if ((a*a)+(b*b)==(c*c)) {
            return true;
        }else if ((b*b)+(c*c)==(a*a)) {
            return true;
        }else if ((c*c)+(a*a)== (b*b)){
            return true;
        }else return false;
    }


    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        int a = odczyt.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int b = odczyt.nextInt();
        System.out.println("Podaj trzecią liczbę:");
        int c = odczyt.nextInt();
        System.out.println(pita(a,b,c));
    }


}
