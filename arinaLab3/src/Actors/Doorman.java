package Actors;


import Enums.Place;
import Interfaces.Watching;

public class Doorman extends Person implements Watching {

    public Doorman(String name){
        super(name);

    }

    @Override
    public void move() {
        System.out.println(getName() + " сел " + Place.GROUND);
    }

    @Override
    public void bow() {
        System.out.println(getName() + " поклонился");
    }

    @Override
    public void watch(Place place) {
        System.out.println(getName() + " смотрит на " + place);
    }
}
