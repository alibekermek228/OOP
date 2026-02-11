package Task2;

enum Major {
    CS,
    MATH,
    PHYSICS
}

public class Task2 {

    public static int totalStudents;
    private final String id;

    private String name;
    private int age;
    private Major major;

    private double totalScore;
    private int subjects;

    // initialization block
    {
        age = 22;   // default age
    }

    // constructor
    public Task2(String id, String name, Major major) {
        this.id = id;
        this.name = name;
        this.major = major;

        totalStudents++;
    }

    public void addScore(double score) {
        totalScore += score;
        subjects++;
    }

    public void addScore(double score1, double score2) {
        totalScore += score1 + score2;
        subjects += 2;
    }

    public double getAverageScore() {
        if (subjects == 0) return 0;
        return totalScore / subjects;
    }

    public final String getId() {
        return id;
    }

    public String getInfo() {
        return name + ", " + age + " years, major: " + major + id;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {

        Task2 s1 = new Task2("S001", "Ali", Major.CS);
        Task2 s2 = new Task2("S002", "Diana", Major.MATH);

        s1.addScore(90);
        s1.addScore(80, 85);

        s2.addScore(70, 75);

        System.out.println(s1.getInfo());
        System.out.println("Average score: " + s1.getAverageScore());

        System.out.println(s2.getInfo());
        System.out.println("Average score: " + s2.getAverageScore());

        System.out.println("Total students: " + Task2.getTotalStudents());
    }
}
