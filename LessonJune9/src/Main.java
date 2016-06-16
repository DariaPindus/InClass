import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person sam = new Person("Sam", 25);
        Person tom = new Person("Tom", 15);
        Person leslie = new Person("Leslie", 10);

        List<Person> persons = new ArrayList<>();
        persons.add(sam);
        persons.add(tom);
        persons.add(leslie);

        Collections.sort(persons);
        System.out.println("Compared by age: " + persons);
        Collections.sort(persons, new PersonNameComparator());
        System.out.println("Compared by name: " + persons);
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
    }
}
