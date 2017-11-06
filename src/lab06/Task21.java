package lab06;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
       int n;
       Scanner s = new Scanner(System.in);
       int x = s.nextInt();
        for (int i =10; i<= 20; i++){
            if (x == i) {
                System.out.println(i + "+");
            }
            else {

                System.out.println(i);
            }
        }
    }
}
