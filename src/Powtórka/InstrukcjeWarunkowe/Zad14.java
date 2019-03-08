package Powtórka.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad14 {
//    public static void main(String[] args) {
//        System.out.println("Podaj wiek");
//        Scanner odczyt = new Scanner(System.in);
//        int age = odczyt.nextInt();
//        if (age >=18){
//            System.out.println("Jesteś osobą pełnoletnią");
//        }else {
//            System.out.println("Nie jesteś osobą pełnoletnią");
//        }
//    }

    public static void main(String[] args) {
        System.out.println("Podaj wiek");
        Scanner odczyt = new Scanner(System.in);
        int age = odczyt.nextInt();
       boolean isAdult = age >= 18;
        System.out.println(isAdult);
    }
}
