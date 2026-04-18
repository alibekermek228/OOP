public class Chest extends Entity implements Pushable, Interactable {
    private boolean opened;

    public Chest(String name, int x, int y) {
        super(name, x, y);
        this.opened = false;
    }

    public boolean isOpened() {
        return opened;
    }

    @Override
    public void push() {
        System.out.println(getName() + " was pushed.");
    }

    @Override
    public void interact() {
        if (opened) {
            System.out.println(getName() + " is already open.");
        } else {
            openChest();
        }
    }

    private void openChest() {
        opened = true;
        System.out.println(getName() + " is now open.");
    }
}
