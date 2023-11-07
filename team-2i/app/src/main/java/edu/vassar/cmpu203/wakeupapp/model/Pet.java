package edu.vassar.cmpu203.wakeupapp.model;
import java.util.Properties;

public class Pet {
    private final String species;
    private final String color;
    private Status prop= new Status();

    Pet(String species, String color){
        this.species = species;
        this.color = color;
    }
    Pet(String species, String color, Status prop){
        this.species = species;
        this.color = color;
        this.prop = prop;
    }


}
