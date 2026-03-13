package Problem1.С;
import java.util.Objects;

public class Device {

    private String brand;
    private int year;

    public Device(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Device: " + brand + " " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        return year == device.year && Objects.equals(brand, device.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, year);
    }
}