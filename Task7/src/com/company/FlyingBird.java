package com.company;

public class FlyingBird extends Bird {
    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public String getFeathers() {
        return this.feathers;
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
        System.out.println("Flying birds with " + this.getFeathers() + " feathers");
        System.out.println("Can they lay eggs? " + this.getLayEggs());
    }

    @Override
    public void fly() {
        System.out.println("Can fly!");
    }
}
