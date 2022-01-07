package program24;
import java.util.Scanner;
public class even {
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
        System.out.print("Even numbers : ");
        for(int a = 0 ; a < len ; a++)
        {
            if(arr[a] % 2 == 0)
            {
                System.out.print(arr[a] + " ");
            }
        }
    }
}
