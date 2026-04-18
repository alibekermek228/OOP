public class Rock extends Entity implements Pushable {
    private double weight;

    public Rock(String name, int x, int y, double weight) {
        super(name, x, y);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void push() {
        System.out.println(getName() + " was pushed a little.");
    }
}
