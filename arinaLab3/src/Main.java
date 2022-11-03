import Actors.Alice;
import Actors.Carp;
import Actors.Doorman;
import Enums.EmotionalCondition;
import Enums.Place;

public class Main {

    public static void main(String[] args) {
        Alice alice = new Alice("Алиса");
        Carp carp = new Carp("Карась");
        Doorman doorman = new Doorman("Швейцар");
        doorman.bow();
        carp.bow();
        alice.emotion(EmotionalCondition.LAUGH);
        alice.move();
        alice.emotion(EmotionalCondition.FINISHEDLAUGHING);
        alice.comeback();
        alice.bow();
        alice.watch(Place.BUSH);
        carp.move();
        doorman.move();
        doorman.watch(Place.SKY);
        doorman.emotion(EmotionalCondition.EMPTYHEAD);
        alice.nearHouse();
        alice.knock();
        alice.emotion(EmotionalCondition.SHYLY);

    }
}
