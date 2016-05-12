package com.pindus.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 12.05.2016.
 */
public class ArrayListTest {

    public static void main(String[] args) {

       /* Animal animal=new Parrot();
        animal.voice();*/

        Animal[] animals = new Parrot[5];
        animals[0] = new Parrot();
        animals[1] = new Cat();

        List<Parrot> list = new ArrayList<Parrot>();

    }
}
