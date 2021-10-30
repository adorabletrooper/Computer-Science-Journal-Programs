package program2;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int dis = num < 0 ? (num - num - num) : num;
        System.out.println(dis);
    }
}
