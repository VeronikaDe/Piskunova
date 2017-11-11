package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String x = k.nextLine();
        char z = x.charAt(0);
        char [] m =  {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        for (int i = 0; i < m.length; i++){
            if (m[i] != z){
                System.out.println(m[i]);
            }
            else {
                System.out.println(x + "+");
            }
        }
    }
}
