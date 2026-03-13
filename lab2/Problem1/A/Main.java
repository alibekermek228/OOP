package Problem1.A;

public class Main {
    public static void main(String[] args){
        Cylinder c = new Cylinder(3, 4);
        Sphere s = new Sphere(6);
        Cube cube = new Cube(12);

        System.out.println("Cylinder volume: " + c.volume());
        System.out.println("Cylinder area: " + c.surfaceArea());

        System.out.println("Sphere volume: " + s.volume());
        System.out.println("Sphere area: " + s.surfaceArea());

        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Cube area: " + cube.surfaceArea());
    }
}
