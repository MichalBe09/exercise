package Powtórka.Metody;

import java.util.Scanner;

public class zad7 {

    static int sumofDigits(int n){

        String digits = new Integer(n).toString();

        int sum = 0;
        for ( char number : digits.toCharArray())
            sum = sum + number - '0' ;

        return  sum;

    }
    public static void main(String[] args) {
        System.out.println("suma cyfr liczby to : "+sumofDigits(32) );

    }

}
