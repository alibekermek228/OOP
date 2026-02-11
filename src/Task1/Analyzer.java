package Task1;

import java.util.Scanner;
public class Analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data d = new Data();
        while (true) {
            System.out.print("Enter number (Q to quit): ");

            if (sc.hasNextDouble()) {
                double x = sc.nextDouble();
                d.add(x);
            } else {
                String s = sc.next();

                if (s.equals("Q") || s.equals("q")) {
                    break;
                }

                System.out.println("Invalid input");
            }
        }

        System.out.println("Average = " + d.getAverage());
        System.out.println("Maximum = " + d.getLargest());
    }
}

