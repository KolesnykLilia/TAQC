package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Bird Eagle = new FlyingBird("brown","Yes");
        Bird Swallow = new FlyingBird("grey","Yes");
        Bird Penguin = new NonflyingBird("black and white","Yes");
        Bird Chicken = new NonflyingBird("orange","Yes");

        var birds = new Bird[]{Eagle,Swallow,Penguin,Chicken};

        Arrays.stream(birds).forEach(x -> {
            System.out.println(x.getClass().getName());
            x.info();
            x.fly();
        });


    }
}
