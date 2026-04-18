public abstract class Entity {
    private String name;
    private int x;
    private int y;

    public Entity(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPosition() {
        System.out.println(name + " position: (" + x + ", " + y + ")");
    }
}