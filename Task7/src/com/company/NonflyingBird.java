package com.company;

public class NonflyingBird extends Bird {
    public NonflyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }

    public void info() {
        System.out.println("Non flying birds with " + this.feathers + " feathers");
        System.out.println("Can they lay eggs? " + this.layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Can't fly!");
    }
}
