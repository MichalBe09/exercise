package Powtórka.zmienne;

import java.util.Random;

public class Zad6 {
    public static void main(String[] args) {
        int a;
        int b;
        Random rand = new Random();
        a = rand.nextInt(50);
        b = rand.nextInt(50);
        System.out.println("Dwie losowe liczby to: "+a+" oraz: "+b);
    }
}
