package program28;
import java.util.Scanner;
public class largesnum {
    public static void main(String[] args){
        int len;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        len = in.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the elements");
        for(int i=0;i < len;i++){
            arr[i] = in.nextInt();
        }
        int max = arr[0];    
        for (int j = 0; j < arr.length; j++) {    
           if(arr[j] > max)  
               max = arr[j];  
        }  
        System.out.println("Largest element present in given array: " + max);
    }
}
