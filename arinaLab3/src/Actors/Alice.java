package Actors;



import Enums.Place;
import Interfaces.Watching;

public class Alice extends Person implements Watching {


    public Alice (String name) {
        super(name);

    }
    public void comeback() {
        System.out.println(getName() + " вернулась в " + Place.BUSH);
    }
    public void nearHouse(){
        System.out.println(getName() + " подошла к " + Place.HOUSE);
    }
    public void knock(){
        System.out.println(getName() + "постучалась в "+ Place.HOUSE);
    }

    @Override
    public void move() {
        System.out.println(getName() + " убежала в "+ Place.FOREST);

    }

    @Override
    public void bow() {
        System.out.println(getName() + " наклонилась и выглянула из-за угла");
    }

    @Override
    public void watch(Place place) {
        System.out.println(getName() + " смотрит из " + Place.BUSH);
    }
}
