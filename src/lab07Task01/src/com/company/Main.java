package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String a = "abcdefwxyz";
        Scanner n = new Scanner(System.in);
        String x = n.nextLine();
       if (a.contains(x)){
           System.out.println("Содержится");
        }
        else {
           System.out.println("Не содержится");
       }
    }
}
