public class Student {
    private String name;
    private String id;
    private int YearOfStudy = 1;
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.YearOfStudy = 1;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public void increment(){
        YearOfStudy++;
    }
    public int getYearOfStudy(){
        return YearOfStudy;
    }
}
