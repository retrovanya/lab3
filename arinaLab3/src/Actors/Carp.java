package Actors;


import Enums.Place;

public class Carp extends Person {

    public Carp(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " ушел " + Place.UNKNOWN);
    }

    @Override
    public void bow() {
        System.out.println(getName() + " поклонился");
    }
}
