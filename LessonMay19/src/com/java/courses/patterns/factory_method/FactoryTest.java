package com.java.courses.patterns.factory_method;

/**
 * Created by User on 19.05.2016.
 */
public class FactoryTest {

    public static void main(String[] args) {

        //как было раньше:
        // Student student = new Student("Sam", 18); нельзя из-за того, что конструктор сделали private

        Student student = Student.newInstance("Sam", 15);
    }
}
