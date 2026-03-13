package Problem4;

public class Main {
    public static void main(String[] args) {

        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);

        System.out.println("Equivalent resistance: " + circuit.getResistance());

        circuit.applyPotentialDiff(12);

        System.out.println("Total potential difference: " + circuit.getPotentialDiff());
        System.out.println("Total current: " + circuit.getCurrent());
        System.out.println("Total power: " + circuit.getPower());

        System.out.println("Resistor a current: " + a.getCurrent());
        System.out.println("Resistor b current: " + b.getCurrent());
        System.out.println("Resistor c current: " + c.getCurrent());
        System.out.println("Resistor d current: " + d.getCurrent());
        System.out.println("Resistor e current: " + e.getCurrent());
    }
}
