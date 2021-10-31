package com.company;

public class Main {
    public static void main(String[] args) {
        Person a1 = new Person("Lilia", 2003);
        Person a2 = new Person("Oleh", 1992);
        Person a3 = new Person("Vasyl", 1998);
        Person a4 = Person.input();

        System.out.println("All people!");
        Person[] people = new Person[]{a1, a2, a3, a4};
        for (Person x : people)
        {
            x.output();
        }

    }
}
