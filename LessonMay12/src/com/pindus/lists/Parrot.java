package com.pindus.lists;

public class Parrot extends Animal{

    Parrot(){
        super("Some name");
        System.out.println("In Parrot constructor");
    }
    @Override
    public void voice() {
        //super.voice();
        System.out.println("???(parrot)");
    }
}
