package Actors;


import Enums.EmotionalCondition;
import Interfaces.Movement;

public abstract class Person implements Movement {


    private String name;

    public Person (String name) {
        this.name =name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void emotion(EmotionalCondition emotionalCondition) {
        if (emotionalCondition != EmotionalCondition.CALM)
        System.out.println("У героя " + getName() + " появляется эмоция: " + emotionalCondition);    else
            System.out.println(getName()+ " в спокойном состоянии");
    }
    }



