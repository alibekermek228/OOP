package Problem4;

public class Parallel extends Circuit {

    private Circuit c1;
    private Circuit c2;
    private double potentialDifference;

    public Parallel(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
        this.potentialDifference = 0;
    }

    @Override
    public double getResistance() {
        double r1 = c1.getResistance();
        double r2 = c2.getResistance();

        return 1.0 / (1.0 / r1 + 1.0 / r2);
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

        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }
}
