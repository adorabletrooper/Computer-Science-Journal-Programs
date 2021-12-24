package program5;
import java.util.Scanner;
public class root {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = in.nextInt();
        System.out.println("Square root: "+ Math.sqrt(num));
        System.out.println("Cube root: "+ Math.cbrt(num));
    }
}
