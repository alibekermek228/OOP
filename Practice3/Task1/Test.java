package Task1;
import java.util.Scanner;


public class Test {
    public static void main(String[] args){
        Animal an1 = new Animal("Iggy",200, "xaski", 25);
        System.out.println(an1.getName());
        System.out.println(an1.getMedicalId());
        an1.PutCollar();
        System.out.println(an1.isDomesticated());
        Cat Marsik = new Cat("Marsik", 13, "home", 10, 10, "Black", "Male");
        System.out.println(Marsik.getName());
        an1.MakeSound();
        Marsik.MakeSound();
        Marsik.Eat();
        Marsik.Eat("Meat");

    }
}
