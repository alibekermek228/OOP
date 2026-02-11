import practice2.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course course = new Course("CS101", "Object-oriented Programming and Design", 5, "None");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Student A", "1"));
        students.add(new Student("Student B", "4"));
        students.add(new Student("Student C", "12"));


        GradeBook gb = new GradeBook(course, students);

        gb.displayMessage();
        System.out.println("Please, input grades for students:");
        System.out.println();

        for (int i = 0; i < gb.getStudentsCount(); i++) {
            Student s = gb.getStudent(i);
            System.out.print(s.getName() + ": ");

            int grade = sc.nextInt();
            gb.setGrade(i, grade);
        }

        System.out.println();
        gb.displayGradeReport();
    }
}
