package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner n = new Scanner(System.in);
	int a = n.nextInt();
	Scanner x = new Scanner(System.in);
	int b = x.nextInt();
	Scanner z = new Scanner (System.in);
	int c = z.nextInt();
	if ((a<b)&&(b<c)){
        System.out.println("Выполняется");
    }
    else{
        System.out.println("Не выполняется");
    }
    }
}
