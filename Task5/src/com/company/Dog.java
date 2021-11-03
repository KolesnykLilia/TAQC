package com.company;

public class Dog {
    String name;
    int age;
    Breeds breed;

    enum Breeds {
        Haski, Labrador, Malinoa, PitBull, Staff
    }

    public Dog(String name, int age, Breeds breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Breeds getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(Breeds breed) {
        this.breed = breed;
    }

    public void output() {
        System.out.println("Name-" + name + ", Age-" + age + ", Breed-" + breed);
    }

}