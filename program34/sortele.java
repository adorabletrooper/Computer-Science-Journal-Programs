package program34;
import java.util.Scanner;
public class sortele {
    static int length;
  
    // Method 1
    // To print the array
    public static void printArray(int[] array)
    {
        // Iterating using for loops
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
  
    // Method 2
    // To sort an array
    public static void sortArray(int[] array)
    {
        int temporary = 0;
  
        // Sort the array 'arr' elements in ascending order
        // using nested for loops
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
  
        // Displaying elements of array after sorting
        System.out.println(
            "Elements of array sorted in ascending order: ");
        printArray(array);
    }
  
    // Method 3
    // Main driver method
    public static void main(String[] args)
    {
        int len;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        len = in.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the elements");
        for(int i=0;i < len;i++){
            arr[i] = in.nextInt();
        }
  
        
        System.out.print("Elements of original array: ");
  
        
        printArray(arr);
  
        
        sortArray(arr);
    }
}
