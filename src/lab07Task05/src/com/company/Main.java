package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = "abcdefwxyz";
        Scanner a = new Scanner(System.in);
        int ca = a.nextInt();
        Scanner b = new Scanner(System.in);
        int cb = b.nextInt();
        if ((ca>=0)&&(ca<=str.length())&&(cb>=0)&&(cb<=str.length())&&(ca<cb)) {
            System.out.println(str.substring(ca, cb + 1));
        }
        else if ((ca<0)||(ca>str.length())){
            System.out.println("Значение CA должно быть в интервале [0,длина строки)");
        }
        else if ((cb<0)||(cb>str.length())){
            System.out.println("Значение CB должно быть в интервале [0,длина строки)");
        }
        else if (ca>cb){
            System.out.println("ca должно быть меньше cb");
        }



    }
}
