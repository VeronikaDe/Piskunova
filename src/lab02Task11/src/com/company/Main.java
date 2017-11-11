package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        if ( x >= 0 ){
            System.out.println(String.format("%.4f",Math.sqrt(x)));

        }
        else {
            System.out.println("Значение X должно быть неотрицательным");
        }
    }
}
