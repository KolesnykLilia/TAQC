package com.company;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть перше число: ");
        int n1 = input.nextInt();
        System.out.println("Введіть друге число: ");
        int n2 = input.nextInt();
        System.out.println("Введіть третє число: ");
        int n3 = input.nextInt();

        if (n1 > n2)
            if (n1 > n3)
                System.out.println("Max:" + n1);
            else {
                if (n2 > n3)
                    System.out.println("Max:" + n2);
            }
        else {
            System.out.println("Max:" + n3);
        }
        if (n1 < n2)
            if (n1 < n3)
                System.out.println("Min:" + n1);
            else {
                if (n2 < n3)
                    System.out.println("Min:" + n2);
            }
        else {
            System.out.println("Min:" + n3);
        }

    }
}
