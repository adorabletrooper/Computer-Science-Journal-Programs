package program8;
import java.util.Scanner;
public class resist {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double r1, r2, s, p;
        System.out.println("Enter the value of resistor 1:");
        r1 = in.nextDouble();
        System.out.println("Enter the value of resistor 2:");
        r2 = in.nextDouble();
        s = r1 + r2;
        p = (r1 * r2) / (r1 + r2);
        System.out.println("Equivalent Resistant in series: "+s);
        System.out.println("Equivalent Resistant in parallel: "+p);
    }
}
