package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //task1
        System.out.println("Введіть радіус кола:");
        double radius = sc.nextDouble();

        double area = Math.PI * (radius * radius);
        System.out.println("Площа кола: " + area);

        double circumference= Math.PI * 2*radius;
        System.out.println("Периметр кола: " + circumference) ;

        //task2
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.next();

        System.out.println("Where are you live " + name + "?");
        String adress =  in.next();

        System.out.println("Your name is " + name + " and your native adress is " + adress);

        //task3
        System.out.println("Введіть c1:");
        double c1 = sc.nextDouble();
        System.out.println("Введіть c2:");
        double c2 = sc.nextDouble();
        System.out.println("Введіть c3:");
        double c3 = sc.nextDouble();

        System.out.println("Введіть t1:");
        int t1 = sc.nextInt();
        System.out.println("Введіть t2:");
        int t2 = sc.nextInt();
        System.out.println("Введіть t3:");
        int t3 = sc.nextInt();

        System.out.println("First call  " + c1*t1);
        System.out.println("Second call " + c2*t2);
        System.out.println("Third call  " + c3*t3);

        System.out.println("Sum = " + c1*t1+c2*t2+c3*t3);
        
    }
}
