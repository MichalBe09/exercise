package Powtórka.String;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String wor1;
        String wor2;
        System.out.println("Wprowadź pierwsze słowo");
        Scanner word1 = new Scanner(System.in);
        wor1 = word1.next();
        System.out.println("Wprowaź drugie słowo");
        Scanner word2 = new Scanner(System.in);
        wor2 = word2.next();

        System.out.println(wor2+" "+wor1);
    }
}
