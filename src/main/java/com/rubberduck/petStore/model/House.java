package com.rubberduck.petStore.model;

import java.util.ArrayList;

public class House {
    private String owner;
    private ArrayList<Pet> pets = new ArrayList<>();

    public House(String owner) {
        this.owner = owner;
    }

    public House(String owner, ArrayList<Pet> pets) {
        this.owner = owner;
        this.pets = pets;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    @Override
    public String toString() {
        return "House{" +
                "owner='" + owner + '\'' +
                ", pets=" + pets +
                '}';
    }
}
