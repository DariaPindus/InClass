package com.pindus.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by User on 12.05.2016.
 */
public class ArrayListTest2 {
    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal parrot = new Parrot();

        List animals = new ArrayList();
        animals.add(cat);
        animals.add(dog);
        animals.add(parrot);
        animals.add(new Random());

        Animal animal = (Animal)animals.get(0);
        animal.voice();

        Animal an_rnd = (Animal)animals.get(3);
        an_rnd.voice();
    }
}
