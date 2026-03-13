package Problem4;

public class Resistor extends Circuit {

    private double resistance;
    private double potentialDifference;

    public Resistor(double resistance) {
        this.resistance = resistance;
        this.potentialDifference = 0;
    }

    @Override
    public double getResistance() {
        return resistance;
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    public void setPotentialDiff(double V) {
        potentialDifference = V;
    }

    @Override
    public void applyPotentialDiff(double V) {
        setPotentialDiff(V);
    }
}
