public class Goblin extends Entity implements Attackable {
    private int health;
    private boolean alive;

    public Goblin(String name, int x, int y, int health) {
        super(name, x, y);
        this.health = health;
        this.alive = true;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return alive;
    }

    @Override
    public void takeDamage(int damage) {
        if (!alive) {
            System.out.println(getName() + " is already dead.");
            return;
        }

        health -= damage;
        System.out.println(getName() + " takes " + damage + " damage. Health = " + health);

        if (health <= 0) {
            die();
        }
    }

    private void die() {
        alive = false;
        System.out.println(getName() + " died.");
    }
}
