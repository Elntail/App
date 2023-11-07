package edu.vassar.cmpu203.wakeupapp.model;

import androidx.annotation.NonNull;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Graveyard {
  //  private List<Pet> deadPets;

  //  public void addPet(Pet pet){
     //   this.deadPets.add(pet);

    private final Collection<Pet> pets;
    public Graveyard() {
        this.pets = new LinkedList<>();
    }

    public void addPet(Pet pet) {

        this.pets.add(pet);
    }
    @NonNull
    public String toString(){

StringBuilder sb = new StringBuilder();

for (Pet pet : pets){
    sb.append(pet.toString());
    sb.append("---------\n");
}
return sb.toString();
    }


}
