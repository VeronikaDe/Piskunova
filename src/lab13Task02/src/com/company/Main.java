package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        double edge = s.nextDouble();
        if (edge <= 0) {
            throw new Exception("Значение edge должно быть положительным");
        }
        try {
            double result = 6 * edge * edge;
            System.out.println(result);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

}
