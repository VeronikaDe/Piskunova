package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double xInGrad = s.nextDouble();
        double xInRad = xInGrad*Math.PI/180;
        double result = Math.sin(xInRad);
        System.out.println(String.format("%.4f", result));
    }
}
