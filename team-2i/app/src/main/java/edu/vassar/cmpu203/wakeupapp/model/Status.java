package edu.vassar.cmpu203.wakeupapp.model;

import java.util.InputMismatchException;

public class Status {
    private int health, happiness = 100;

    Status(){}
    Status(int health, int happiness){
        this.health = health;
        this.happiness = happiness;
    }

    /**
     * Returns the current value of the animal's health
     * @return health of the pet
     */
    public int getHealth(){return this.health;}

    /**
     * Returns the current value of the animal's happiness
     * @return happiness of the pet
     */
    public int getHappiness(){return this.happiness;}

    /**
     * Changes the status of the pet by a specific value
     * @param health amount that the health of the pet to be modified by
     * @param happiness amount that the happiness of the pet to be modified by
     */
    public void modifyParam(int health, int happiness) {
        this.health += health;
        this.happiness += happiness;
    }

    /**
     * Sets the health and happiness parameters to a specific value, cannot be nonpositive
     * @param health value of health of the pet to be set to
     * @param happiness value of happiness of the pet to be set to
     * @throws IllegalArgumentException either values cannot be less then 1
     */
    public void setHlhHap(int health, int happiness) throws IllegalArgumentException{
        if(health < 1 || happiness < 1){
            throw new IllegalArgumentException("Either value cannot be zero.");
        }
        this.health = health;
        this.happiness = happiness;
    }
    /**
     * Sets the health parameter to a specific value, cannot be nonpositive
     * @param amount value of health of the pet to be set to
     * @throws IllegalArgumentException value cannot be less then 1
     */
    public void setHlh(int amount) throws IllegalArgumentException{
        if(health < 1){
            throw new IllegalArgumentException("Input value cannot be zero.");
        }
        this.health = amount;
    }
    /**
     * Sets the happiness parameter to a specific value, cannot be nonpositive
     * @param amount value of happiness of the pet to be set to
     * @throws IllegalArgumentException value cannot be less then 1
     */
    public void setHap(int amount) throws IllegalArgumentException{
        if(happiness < 1){
            throw new IllegalArgumentException("Input value cannot be zero.");
        }
        this.happiness = amount;
    }
    /**
     * Returns the toString of the object
     */
    public String toString(){return "health = " + this.health + ", happiness = " + this.happiness;
    }


}
