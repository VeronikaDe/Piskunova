package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int k = n.nextInt();
        if (k>0)
        {
            System.out.println(Math.sqrt(k));

        }
        else {
            System.out.println(k*k);
        }
    }
}
