package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        double distanceInKm = n.nextDouble();
        Scanner k = new Scanner(System.in);
        double distanceInFeet = k.nextDouble();
        if ((distanceInKm >= 0) && (distanceInFeet >= 0)) {
            if ((distanceInKm) > (distanceInFeet*0.000305)) {
                System.out.println("Расстояние в футах меньше");
            } else if ((distanceInKm) < (distanceInFeet*0.000305)) {
                System.out.println("Расстояние в километрах меньше");
            } else if (distanceInFeet < 0) {
                System.out.println("Значение distanceInFeet должно быть неотрицательным");
            } else if (distanceInKm < 0) {
                System.out.println("Значение distanceInKm должно быть неотрицательным");
            }
        }
    }
}