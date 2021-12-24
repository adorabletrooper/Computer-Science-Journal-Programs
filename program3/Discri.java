package program3;
import java.util.Scanner;
public class Discri {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int b, a, c;
        double d;
        System.out.println("Enter the values of a, b and c respectively");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = Math.pow(b, 2) + 4 * a * c;
        System.out.println("Discriminant: "+ d);
    }
}
