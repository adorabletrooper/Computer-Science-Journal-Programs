package program1;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int amt=0, twoth=0, fivehu=0, onehu=0, fifty=0, twty=0, ten=0, rem=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount: ");
        amt = in.nextInt();
        for (int i=0; i!=amt;) {
            if (amt > 2000) {
                twoth = (int) amt / 2000;
                amt -= twoth * 2000;
            }
            if (amt > 500 && amt < 2000) {
                fivehu = (int) amt / 500;
                amt -= fivehu * 500;
            }
            if (amt > 100 && amt < 500) {
                onehu = (int) amt / 100;
                amt -= onehu * 100;
            }
            if (amt > 50 && amt < 100) {
                fifty = (int) amt / 50;
                amt -= fifty * 50;
            }
            if (amt > 20 && amt < 50) {
                twty = (int) amt / 20;
                amt -= twty * 20;
            }
            if (amt > 10 && amt < 20) {
                ten = (int) amt / 10;
                amt -= ten * 10;
            }
            if (amt < 10) {
                rem = amt;
                amt=0;
            }
        }
        System.out.println("Two thousand rupee denomination: " + twoth + "\nFive Hundred rupee denomination: " + fivehu + "\nHundred rupee denomination: "+ onehu + "\nFifty rupee denomination: "+ fifty + "\nTwenty rupee denomination: " + twty + "\nTen rupe denomination: "+ ten+ "\nRemaining Amount: "+rem);
        
    }
}