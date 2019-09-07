import java.util.*;
class duplicate {
    public static void main(String[] args) {
        int a[] = new int[50];
        int dup[] = new int[40];
        int count[] = new int[40];
        int n,top=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of integer array: ");
        n = scan.nextInt();
        System.out.println("Enter integer array : ");
        for(int i=0;i<n;i++) {
            int flag=0;
            a[i] = scan.nextInt();
            for(int j=0;j<top;j++) {
                if (dup[j] == a[i]) {
                    count[j]++;
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                dup[top++]=a[i];
            }
        }
        for(int i=0;i<top;i++){
            System.out.println(dup[i] +" repeated "+count[i]+" times.");
        }
    }
}
