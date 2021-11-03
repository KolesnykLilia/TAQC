package com.company;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Emma", 1, Dog.Breeds.Haski);
        Dog d2 = new Dog("Jackson", 4, Dog.Breeds.PitBull);
        Dog d3 = new Dog("Mike", 7, Dog.Breeds.Malinoa);

        System.out.println("All dogs:");
        d1.output();
        d2.output();
        d3.output();
        System.out.println();

        //Oldest dog
        if (d1.getAge() > d2.getAge() && d1.getAge() > d3.getAge()) {
            System.out.println(d1.name + " is the oldest.");
        } else if (d2.getAge() > d3.getAge() && d2.getAge() > d1.getAge())
            System.out.println(d2.name + "  is the oldest.");
        else
            System.out.println(d3.name + " is the oldest.");

        //SameName
        if (d1.getName().equals(d2.getName()) || d1.getName().equals(d3.getName())) {
            System.out.println("We have dogs with the same names.");
        } else System.out.println("The same names don`t exist.");
    }


}