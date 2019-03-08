package Powtórka.Wejściówka;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        System.out.println("Wpisz tekst:");
        Scanner odczyt = new Scanner(System.in);
        String sent = odczyt.nextLine();
        for (int i = 0; i < sent.length() ; i++) {
            if (sent.charAt(i)== 'z' || sent.charAt(i) == 'Z'){
                System.out.println(sent.charAt(i));
            }

        }
    }
}
