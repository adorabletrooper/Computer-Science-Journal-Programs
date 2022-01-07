package program30;
import java.util.Scanner;
public class allfre {
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
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}
