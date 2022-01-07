package program17;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int r, sum=0, temp, num;
        System.out.println("Enter a number");
        num = in.nextInt();
        temp=num;    
        while(num>0){    
            r=num%10;    
            sum=(sum*10)+r;    
            num=num/10;    
        }    
        if(temp==sum)    
            System.out.println("palindrome number ");    
        else    
            System.out.println("not palindrome");    
    }
}

