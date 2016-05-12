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

        /*
        Animal[] animals = new Parrot[5];
        animals[0] = new Parrot();
        animals[1] = new Cat();
        */

        List<Parrot> parrotList = new ArrayList<Parrot>();
        parrotList.add(new Parrot("first"));
        parrotList.add(new Parrot("second"));
        parrotList.add(new Parrot("third"));

        for (int i=0; i < parrotList.size(); i++){
            Parrot parrot = parrotList.get(i);
            System.out.println(parrot);
        }

        for (Parrot parrot : parrotList){
            System.out.println(parrot);
        }

    }
}
