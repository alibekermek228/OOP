package Task1;

public class Cat extends Animal {
    protected int tail;
    protected String color;
    protected String Gender;
    public Cat(String name, int MedicalId, String breed, int weight, int tail, String color, String Gender) {
        super(name, MedicalId, breed, weight);
        this.tail = tail;
        this.color = color;
        this.Gender = Gender;
    }
    public String getColor() {
        return color;
    }
    public String getGender(){
        return Gender;
    }
    public int getMedicalId(){
        return super.MedicalId;
    }
    @Override
    public void MakeSound(){
        System.out.println("Meow!!!");
    }
    public void Eat(){
        System.out.println("Cat eat!");
    }
    public void Eat(String SomeThing){
        System.out.println("Cat eat " + SomeThing + " !");
    }



}
