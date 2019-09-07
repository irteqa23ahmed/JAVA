import java.util.*;
class calprime {
    public static void displayPrime() {
        int i=2,count=0,flag=0;
        while(count<50){
            for(int j=2;j<i;j++){
            if(i%j==0)
            {
                flag=1;
                break;
            }}
            if(flag==0){
                System.out.print(i+" ");
                count++;
            }
            flag=0;
            i++;
        }
    }
}
public class prime_50 {
    public static void main(String[] args) {
        calprime.displayPrime();
    }
}
