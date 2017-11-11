package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        Scanner n = new Scanner(System.in);
        int y = n.nextInt();
        if (x>y){
            System.out.println("Первое");
        }
        else {
            System.out.println("Второе");
        }
    }
}
