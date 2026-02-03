import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sk = new Scanner(System.in);
        int h = sk.nextInt();
        int m = sk.nextInt();
        int s = sk.nextInt();

        Time t1 = new Time(h,m,s);
        System.out.println(t1.toUniversal());
        System.out.println(t1.toStandard());
        Time t2 = new Time(0,0,2);
        t1.add(t2);
        System.out.println(t1.toUniversal());
    }
}
