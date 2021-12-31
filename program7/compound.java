package program7;
import java.util.Scanner;
public class compound {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double p, r, n, t, fa;
        System.out.println("Enter the Initial principal Amount:");
        p = in.nextDouble();
        System.out.println("Enter the rate of interest:");
        r = in.nextDouble();
        System.out.println("Enter the number of times interest applied per time period:");
        n = in.nextDouble();
        System.out.println("Enter the number of time periods elapsed:");
        t = in.nextDouble();
        fa = Math.pow(p * (1 + (r/n)), n * t);
        System.out.println("Final Amount: "+ fa);


    }
}
