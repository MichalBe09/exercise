package Powtórka.Pętle;

import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {
            System.out.println("Wprowadź liczbę");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if (number == 1) {
                System.out.println("Liczba pierwsza false");
            } else {
                boolean check = true;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        check = false;

                    }
                }
                System.out.println("Liczba pierwsza " + check);
            }
        }

    }


