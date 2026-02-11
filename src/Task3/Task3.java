package Task3;

public class Task3 {
    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        System.out.println(t1.getFahrenheit());
        System.out.println(t1.getCelsius());


        Temperature t2 = new Temperature(12);
        System.out.println(t2.getCelsius());

        Temperature t3 = new Temperature('F');
        System.out.println(t3.getCelsius());
        t3.set(25, 'C');
        System.out.println(t3.getFahrenheit());
        Temperature t4 = new Temperature(37, 'C');
        System.out.println(t4.getCelsius());

    }

}
