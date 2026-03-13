package Problem5;

import Problem5.Persons.Person;

import java.util.ArrayList;

public class PersonRegistry {

    private ArrayList<Person> people;

    public PersonRegistry() {
        people = new ArrayList<>();
    }

    public void addPerson(Person p) {
        people.add(p);
    }

    public void removePerson(Person p) {
        people.remove(p);
    }

    public String toString() {

        String result = "Registry:\n";

        for (Person p : people) {
            result += p.toString() + "\n";
        }

        return result;
    }
}
