package program14;
import java.util.Scanner;
public class sumdig {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num, digit, sum=0;
        System.out.println("Enter the number");
        num = in.nextInt();
        while(num > 0){
            digit = num % 0;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum: "+sum);
    }
}
