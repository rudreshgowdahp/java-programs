package com.thinksworks.inheritance.mainrunner;

import com.thinksworks.inheritance.external.Animal;
import com.thinksworks.inheritance.internal.Dog;

public class Runner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.isAnimalAreThere();

    }
}