package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalInM = s.nextInt();
        Scanner n = new Scanner(System.in);
        int partInCm = n.nextInt();
        if ((totalInM > 0) && (partInCm > 0)) {
            System.out.println(totalInM * 100 / partInCm);
            System.out.println(totalInM * 100 % partInCm);
        } else if (totalInM <= 0) {
            System.out.println("Значение totalInM должно быть положительным");
        } else {
            System.out.println("Значение partInCm должно быть положительным");
        }
    }
}