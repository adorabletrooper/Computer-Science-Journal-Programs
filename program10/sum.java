package program10;
import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int len;
        double sum, total=0;
        System.out.println("How many numbers you want to enter?");
        len = in.nextInt();
        System.out.println("Keep entering "+len+ " numbers");
        for(int i=0;i<(len-1);i++){
            sum = in.nextDouble();
            total += sum;
        }
        System.out.println("Sum of all numbers: "+total);
        System.out.println("Average of all the numbers: "+(total / len));
    }
}
