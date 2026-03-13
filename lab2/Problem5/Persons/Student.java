package Problem5.Persons;

public class Student extends Person {

    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getOccupation() {
        return "Student: " + major;
    }
}