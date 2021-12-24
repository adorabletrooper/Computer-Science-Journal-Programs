package program2;
import java.util.Scanner;
public class Dist {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x1, x2, y1, y2;
        System.out.println("Enter the coordinates in the following order:\nx1, y1, x2, y2");
        x1 = in.nextInt();
        y1 = in.nextInt();
        x2 = in.nextInt();
        y2 = in.nextInt();
        double ans = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        System.out.println("The distance between the points: " + ans);
    }
}
