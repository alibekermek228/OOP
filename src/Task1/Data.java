package Task1;

public class Data {
    private double sum;
    private double max;
    private int count;

    public Data() {
    }

    public void add(double value) {
        sum += value;

        if (count == 0) {
            max = value;
        } else if (value > max) {
            max = value;
        }

        count++;
    }

    public double getAverage() {
        if (count == 0) return 0.0;
        return sum / count;
    }

    public double getLargest() {
        return max;
    }
}
