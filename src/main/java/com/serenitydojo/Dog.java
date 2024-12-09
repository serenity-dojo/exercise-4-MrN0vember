package com.serenitydojo;

public class Dog {
    public String name;
    public String favoriteToy;
    public int age;
    public static final String DOG_NOISE = "Woof";

    // consturctor method
    public Dog(String name, String toy, int age) {
        this.name = name;
        this.favoriteToy = toy;
        this.age = age;
    }
    //Get Method
    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public String makeNoise() {
        return DOG_NOISE;
    }

    public boolean isFed(){
        return true;
    }


}
