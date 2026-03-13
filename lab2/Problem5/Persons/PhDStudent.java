package Problem5.Persons;

import Problem5.Animals.Animal;
import Problem5.Animals.Dog;

public class PhDStudent extends Person {

    private String field;
    private String topic;

    public PhDStudent(String name, int age, String field, String topic) {
        super(name, age);
        this.field = field;
        this.topic = topic;
    }

    public void assignPet(Animal pet) {

        if (pet instanceof Dog) {
            System.out.println("PhD students cannot own dogs.");
            return;
        }

        super.assignPet(pet);
    }

    public String getOccupation() {
        return "PhD Student in " + field + " researching " + topic;
    }
}