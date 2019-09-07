import java.util.*;
class calfib {
    public static void displayFibonacci(int x) {
        int a=0,b=1,c;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<x;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
public class fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer: ");
        n = scan.nextInt();
        calfib.displayFibonacci(n);
    }
}
