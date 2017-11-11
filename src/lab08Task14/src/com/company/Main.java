package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner m = new Scanner(System.in);
	int multi = m.nextInt();
	Scanner n = new Scanner(System.in);
	String k = n.nextLine();
	String q[] = k.split(" ");
	for (int j = 0; j < k.length(); j++){
        System.out.print(Integer.parseInt(q[j])*multi + " ");
    }
    }
}
