package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String str = s.nextLine();
            char[] m = str.toCharArray();
            int cout = 1;
            for (int i =0; i< str.length(); i++){
                if (m[i] == ','){
                    cout++;
                }
            }
            System.out.println(cout);
        }
}
