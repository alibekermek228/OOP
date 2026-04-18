package Task2;

import java.util.Vector;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        Vector<Person> people = new Vector<>();
        System.out.println("Hello, its the test program!" +
                "Type=1 to the check all information about persons " + "Type=2 to add a new Person"
        );


        people.add(new Person("Ali", "Almaty"));
        people.add(new Student("Dana", "Astana", "CS", 2, 120000));
        people.add(new Staff("Murat", "Shymkent", "IT School", 300000));
        people.add(new Person("Alibek", "Abaya 154"));

        for (Person p : people) {
            System.out.println(p);
        }
    }
}