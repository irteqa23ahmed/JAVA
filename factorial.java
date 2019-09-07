import java.util.*;
class calfact {
    public static int fact(int x) {
        int n = 1;
        for (int i=x;i>1;i--){
            n *= i;
        }
        return n;
    }
}
public class factorial {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer: ");
        n = scan.nextInt();
        n = calfact.fact(n);
        System.out.println("Factorial = "+n);
    }
}
