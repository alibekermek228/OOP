public class Knight extends Entity {
    private int health;
    private int damage;

    public Knight(String name, int x, int y, int health, int damage) {
        super(name, x, y);
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void attack(Attackable target) {
        System.out.println(getName() + " attacks!");
        target.takeDamage(damage);
    }

    public void push(Pushable target) {
        System.out.println(getName() + " pushes.");
        target.push();
    }

    public void interact(Interactable target) {
        System.out.println(getName() + " interacts.");
        target.interact();
    }
}
