package com.java.courses.patterns.singleton;


public class SingletonTest {

    //Этого мы не сможем сделать:
    /*Singleton singleton = new Singleton();
    Singleton singleton1 = new Singleton();
    Singleton singleton2 = new Singleton();*/
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        
        singleton.printSmth();
    }


}
