package program12;
import java.util.Scanner;
public class factor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num = in.nextInt();
        System.out.println("Factors are as follows: ");
        for(int i=1;i<=num;i++){
            if(i==num){
                System.out.print(num);
            }
            else{
                if(num % i == 0){
                    System.out.print(i +", ");
                }
            }
            
        }
    }
}
