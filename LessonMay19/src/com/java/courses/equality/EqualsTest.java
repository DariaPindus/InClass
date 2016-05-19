package com.java.courses.equality;


public class EqualsTest {

    public static void main(String[] args) {

        Person p1 = new Person("Ivan", "Ivanov", 33);
        Person p2 = new Person("Ivan", "Ivanov", 33);
        Person p3 = new Engineer("Ivan", "Ivanov", 33);
        Person p4 = new Student("Ivan", "Ivanov", 33);

        System.out.println("== test:");
        if (p1==p2)
            System.out.println("People are equals");
        else
            System.out.println("They aren't equals");

        System.out.println();
        System.out.println("equals test:");


        if(p1.equals(p2))
            System.out.println("People are equals");
        else
            System.out.println("They aren't equals");
    }
}
