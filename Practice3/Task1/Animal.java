package Task1;

public class Animal {
    protected String name;
    protected int MedicalId;
    protected String breed;
    protected int weight;
    protected boolean collar;
    public Animal(String name,int MedicalId, String breed,int weight){
        this.name = name;
        this.MedicalId = MedicalId;
        this.breed = breed;
        this.weight = weight;
        this.collar = false;
    }
    public String getName(){
        return name;
    }
    public int getMedicalId(){
        return MedicalId;
    }
    public String getBreed(){
        return breed;
    }
    public int getWeight(){
        return weight;
    }
    public void PutCollar(){
        collar = true;
    }
    public boolean isDomesticated(){
        return collar;
    }
    public void MakeSound(){
        System.out.println("Animal makes a sound!");
    }





}

