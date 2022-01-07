package program15;
import java.util.Scanner;
public class lennum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num, count = 0;
        System.out.println("Enter the number");
        num = in.nextInt(); 
        while (num != 0) {
        num /= 10;
        ++count;
        }

        System.out.println("Number of digits: " + count);
        
    }
}
