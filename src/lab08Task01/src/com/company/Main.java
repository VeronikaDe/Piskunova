package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int p = a.nextInt();
        Scanner n = new Scanner(System.in);
        String k = n.nextLine();
        String m[] = k.split(" ");
        int q = m.length;
        if ( k.equals("")) {
            System.out.println("Исходная строка пуста");
        } else if ((p < 0) || (p >= q)) {
            System.out.println("Число A должно быть в интервале [0, размер массива)");
        } else {
            for (int i = 0; i < k.length(); i++) {
                if (i == p) {
                    System.out.println(m[i]);
                }

            }
        }

    }
}
