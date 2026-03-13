package Problem5.Animals;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    public String getSound() {
        return "Tweet";
    }
}
