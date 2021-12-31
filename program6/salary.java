package program6;
import java.util.Scanner;
public class salary {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sal;
        double da, hra, pf, gs, ns;
        System.out.println("Enter salary");
        sal = in.nextInt();
        da = (75 / 100) * sal;
        hra = (25/100) * sal;
        pf = (12 / 100) * sal;
        gs = sal + da + hra;
        ns = gs - pf;
        System.out.println("Details are as follows");
        System.out.println("Basic Salary: "+ sal +"\nDearness Allowance:"+ da + "\nHouse Rent Allowance: "+ hra + "\nProvident Fund: "+ pf +"\nGross Salary: "+ gs +"\nNet Salary: "+ns);
    }
}

