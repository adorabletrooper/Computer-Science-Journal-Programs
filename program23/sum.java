package program23;
import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        int len, sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        len = in.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the elements");
        for(int i=0;i < len;i++){
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {   
            sum = sum + arr[i];  
        }    
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}
