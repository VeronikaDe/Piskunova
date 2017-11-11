package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner str = new Scanner(System.in);
	double number = str.nextDouble();
	double x = 7.0;
        System.out.println(String.format("%.4f", number+x));
    }
}
