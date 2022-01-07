package program27;
import java.util.Scanner;
public class factorialarray {
    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return(n * factorial(n-1));
        }
    }
    public static void main(String[] args){
        int len, data;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        len = in.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the elements");
        for(int i=0;i < len;i++){
            arr[i] = in.nextInt();
        }
        for(int j=0; j< len;j++){
            data = factorial(arr[j]);
            System.out.println(data);
        }
        
    }
}
