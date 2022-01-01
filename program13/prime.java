package program13;
import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num, count=0;
        System.out.println("Enter the number");
        num = in.nextInt();
        for(int i=1;i<=num;i++){
            if (i == num){
                count++;
            }
            else{
                if(num % i == 0){
                    count++;
                }
            }
            
        }
        if(count > 2){
            System.out.println("Given Number is not a Prime Number");
        }
        else{
            System.out.println("Given Number is a Prime Number");
        }
    }
}
