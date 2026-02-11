import practice2.Student;
import java.util.ArrayList;

public class GradeBook {
    private Course course;
    private ArrayList<Student> students;
    private int[] grades;

    public GradeBook(Course course, ArrayList<Student> students) {
        this.course = course;
        this.students = students;
        this.grades = new int[students.size()];
    }

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new int[0];
    }

    public void addStudent(Student s) {
        students.add(s);

        int[] newGrades = new int[students.size()];
        for (int i = 0; i < grades.length; i++) newGrades[i] = grades[i];
        newGrades[newGrades.length - 1] = 0;
        grades = newGrades;
    }

    public int getStudentsCount() {
        return students.size();
    }

    public Student getStudent(int i) {
        return students.get(i);
    }

    public void setGrade(int i, int grade) {
        grades[i] = grade;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + " " + course.getDescription() + "!");
        System.out.println();
    }

    public void displayGradeReport() {
        double avg = determineClassAverage();

        int minIndex = getMinIndex();
        int maxIndex = getMaxIndex();

        System.out.println("Class average is " + String.format("%.2f", avg) + ". " +
                "Lowest grade is " + grades[minIndex] + " (" +
                students.get(minIndex).getName() + ", id: " + students.get(minIndex).getId() + ").");

        System.out.println("Highest grade is " + grades[maxIndex] + " (" +
                students.get(maxIndex).getName() + ", id: " + students.get(maxIndex).getId() + ").");

        System.out.println();
        System.out.println("Grades distribution:");
        outputBarChart();
    }

    private double determineClassAverage() {
        if (grades.length == 0) return 0;

        int sum = 0;
        for (int g : grades) sum += g;
        return (double) sum / grades.length;
    }

    private int getMinIndex() {
        int min = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < grades[min]) min = i;
        }
        return min;
    }

    private int getMaxIndex() {
        int max = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > grades[max]) max = i;
        }
        return max;
    }

    private void outputBarChart() {
        int[] freq = new int[11];

        for (int g : grades) {
            if (g == 100) freq[10]++;
            else freq[g / 10]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (i == 10) {
                System.out.print("  100: ");
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            for (int j = 0; j < freq[i]; j++) System.out.print("*");
            System.out.println();
        }
    }

    public String toString() {
        return "GradeBook{" + course + ", students=" + students.size() + "}";
    }
}
