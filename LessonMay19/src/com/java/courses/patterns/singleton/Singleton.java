package com.java.courses.patterns.singleton;


public class Singleton {

    private static Singleton instance = null;

    //чтобы не давать возможность создавать с помощью new
    //
    private Singleton (){
    }

    public static Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public void printSmth(){
        System.out.println("Singleton");
    }
}
