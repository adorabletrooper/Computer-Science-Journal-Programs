package program9;
import java.util.Scanner;
public class roots {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a, b, c, d;
        String s;
        System.out.println("Enter the value of a");
        a = in.nextDouble();
        System.out.println("Enter the value of b");
        b = in.nextDouble();
        System.out.println("Enter the value of c");
        c = in.nextDouble();
        d = (b * b) - (4 * a * c);
        s = (d > 0) ? "real and unequal": (d < 0) ? "imaginary": "real and equal";
        System.out.println("The roots of the given quadratic equation are "+s);
    }
}
