package program19;
import java.util.Scanner;
public class f {
  static int factorial(int n){    
    if (n == 0)    
      return 1;    
    else    
      return(n * factorial(n-1));    
  }    
  public static void main(String args[]){  
    int fact=1, number;  
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number");
    number = in.nextInt();
    fact = factorial(number);   
    System.out.println("Factorial of "+number+" is: "+fact);    
  }
}
