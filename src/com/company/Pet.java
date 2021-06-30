package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public com.company.color getColor() {
        return color;
    }

    public void setColor(com.company.color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(15) + 1;
    }
    public String getInfo(){
        return "Age: " + age + "\nColor: " + color +
                "\nShelter Address: " + shelter.getAddress() +
                "\nShelter name: " + shelter.getName();
    }
}
