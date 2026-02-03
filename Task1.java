
import java.util.Scanner;
public class Task1{

    public static void main(String[] args){
        Student s1 = new Student("Alibek", "24b031755");
        Scanner sk = new Scanner(System.in);
        String Name = sk.nextLine();
        String Id = sk.nextLine();
        Student s2 = new Student(Name, Id);
        s1.increment();
        s2.increment();
        System.out.println(s1.getYearOfStudy() + " " + s2.getYearOfStudy());
    }
}