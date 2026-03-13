package Problem1.С;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<Device> devices = new HashSet<>();
        Phone p1 = new Phone("Apple", 2023, "iPhone 15");
        Phone p2 = new Phone("Apple", 2023, "iPhone 15");
        Phone p3 = new Phone("Samsung", 2022, "Galaxy S22");
        devices.add(p1);
        devices.add(p2);
        devices.add(p3);
        for(Device d: devices){
            System.out.println(d);
        }
        System.out.println("Total devices:" + devices.size());

    }
}
