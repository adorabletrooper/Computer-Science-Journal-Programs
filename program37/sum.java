package program37;

public class sum {
    public static void main(String[] args){
        int len, rows, sumRow,cols;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        len = in.nextInt();
        int arr[][] = new int[len];
        System.out.println("Enter the elements");
        for(int i=0;i < len;i++){
            arr[i] = in.nextInt();
        }
        for i in range(0, rows):{  
            sumRow = 0;  
            for j in range(0, cols):{  
                sumRow = sumRow + arr[i][j];  
                print("Sum of " + str(i+1) +" row: " + str(sumRow));
            }
        }
    }
}
