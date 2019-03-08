package Powtórka.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad16 {
//    public static void main(String[] args) {
//        System.out.println("Wprowadź wiek pierwszej osoby:");
//        Scanner odczyt = new Scanner(System.in);
//        int n1 = odczyt.nextInt();
//        System.out.println("Wprowadź wiek drugiej osoby:");
//        int n2 = odczyt.nextInt();
//        if (n1 >=13 && n1 <=18 && n2 >=13 && n2 <=18 ){
//            System.out.println("Obie osoby są w wieku nastolatka");
//        }else {
//            System.out.println("Obie osoby nie są w wieku nastolatka");
//        }
//    }

    public static void main(String[] args) {
        System.out.println("Wprowadź wiek pierwszej osoby:");
        Scanner odczyt = new Scanner(System.in);
        int n1 = odczyt.nextInt();
        System.out.println("Wprowadź wiek drugiej osoby:");
        int n2 = odczyt.nextInt();
        boolean areteen = n1 >= 13 && n1 <= 18 && n2 >= 13 && n2 <= 18;
        System.out.println(areteen);
    }
}
