package com.company;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n1:");
        float n1 = sc.nextFloat();
        System.out.println("Enter n2:");
        float n2 = sc.nextFloat();
        System.out.println("Enter n3:");
        float n3 = sc.nextFloat();

        int counter = 0;
        if (5 > Math.abs(n1)) {
            counter++;
        }
        if (5 > Math.abs(n2)) {
            counter++;
        }
        if (5 > Math.abs(n3)) {
            counter++;
        }
        if (counter == 3)
            System.out.println("Three numbers belong to range -5 < number < 5!");
        else
            System.out.println("Not all numbers belong to range -5 < number < 5!");

    }
}
