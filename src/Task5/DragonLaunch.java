package Task5;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> people = new Vector<>();

    public void kidnap(Person p) {
        people.add(p);
    }

    public boolean willDragonEatOrNot() {
        int top = -1;

        for (int i = 0; i < people.size(); i++) {
            Person cur = people.get(i);

            if (top >= 0 &&
                    people.get(top).getGender() == Gender.B &&
                    cur.getGender() == Gender.G) {
                top--;
            } else {
                top++;
                people.set(top, cur);
            }
        }

        if (top >= 0)
            return true;
        else
            return false;

    }

    public String toString() {
        return people.toString();
    }

    public static void main(String[] args) {
        DragonLaunch d1 = new DragonLaunch();
        d1.kidnap(new Person(Gender.B, "A"));
        d1.kidnap(new Person(Gender.B, "B"));
        d1.kidnap(new Person(Gender.G, "C"));
        d1.kidnap(new Person(Gender.G, "D"));
        System.out.println("Dragon eats? " + d1.willDragonEatOrNot());
        System.out.println();

        DragonLaunch d2 = new DragonLaunch();
        d2.kidnap(new Person(Gender.G, "A"));
        d2.kidnap(new Person(Gender.B, "B"));
        d2.kidnap(new Person(Gender.G, "C"));
        d2.kidnap(new Person(Gender.B, "D"));
        System.out.println("Dragon eats? " + d2.willDragonEatOrNot());
    }
}

