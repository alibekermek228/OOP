public class WoodenBox extends Entity implements Attackable, Pushable {
    private boolean broken;

    public WoodenBox(String name, int x, int y) {
        super(name, x, y);
        this.broken = false;
    }

    public boolean isBroken() {
        return broken;
    }

    @Override
    public void takeDamage(int damage) {
        if (broken) {
            System.out.println(getName() + " is already broken.");
            return;
        }
        destroy();
    }

    @Override
    public void push() {
        System.out.println(getName() + " was pushed.");
    }

    private void destroy() {
        broken = true;
        System.out.println(getName() + " broke immediately.");
    }
}