public class Game {
    public static void main(String[] args) {
        Knight knight = new Knight("Arthur", 0, 0, 100, 30);
        Goblin goblin = new Goblin("Goblin", 1, 1, 50);
        WoodenBox box = new WoodenBox("Wooden Box", 2, 2);
        Rock rock = new Rock("Rock", 3, 3, 150.0);
        Chest chest = new Chest("Chest", 4, 4);

        knight.showPosition();
        goblin.showPosition();
        box.showPosition();
        rock.showPosition();
        chest.showPosition();

        System.out.println("\n--- ATTACK GOBLIN ---");
        knight.attack(goblin);
        knight.attack(goblin);

        System.out.println("\n--- ATTACK BOX ---");
        knight.attack(box);
        knight.attack(box);

        System.out.println("\n--- PUSH OBJECTS ---");
        knight.push(box);
        knight.push(rock);
        knight.push(chest);

        System.out.println("\n--- INTERACT WITH CHEST ---");
        knight.interact(chest);
        knight.interact(chest);
    }
}
