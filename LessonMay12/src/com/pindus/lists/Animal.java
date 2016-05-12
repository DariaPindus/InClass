package com.pindus.lists;

/**
 * Created by User on 12.05.2016.
 */
public class Animal {

    String name;

    Animal(){
        System.out.println("In animal constructor");
    }

    Animal(String name){
        this.name=name;
        System.out.println("In Animal with name");
    }

    public void voice(){
        System.out.println("Animal");
    }
}
