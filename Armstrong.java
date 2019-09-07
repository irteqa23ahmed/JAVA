import java.util.*;
class armstrong {
    public static boolean checkArmstrongNumber(int number){
        int originalNumber, remainder, result = 0,n=0;
        originalNumber = number;
        for (;originalNumber != 0; originalNumber /= 10, ++n);
        originalNumber = number;
        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }
        if(result == number)
            return true;
        else
            return false;
    }
}
public class Armstrong {
    public static void main(String[] args) {
        int n;
        boolean x;
        System.out.println("Enter number: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        x = armstrong.checkArmstrongNumber(n);
        if(x)
        System.out.println(n+" is an Armstrong number.");
        else
        System.out.println(n+" is not an Armstrong number.");
    }
}
