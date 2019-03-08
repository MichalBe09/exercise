package Powtórka.Pętle;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Zad7 {
    public static void main(String[] args)  {
        Set<Integer> intSet = new LinkedHashSet<Integer>();
        Random r = new Random();
        while (intSet.size() <= 5) {
            intSet.add(r.nextInt(49)); // or your method of generating random numbers
        }
        System.out.println(intSet);
    }
}
