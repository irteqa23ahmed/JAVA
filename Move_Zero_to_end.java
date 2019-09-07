import java.util.*;
public class Move_Zero_to_end {
	public static void main(String args[]) {
	int arr[] = new int[50];
	int a[] = new int[50];
	int n,i,j=0;
	int count=0;
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter size of integer array: ");
    n = scan.nextInt();
    System.out.println("Enter integer array : ");
    for(i=0;i<n;i++) 
	{
	    arr[i]=scan.nextInt();
	    if(arr[i]==0) count++;
	    else a[j++]=arr[i];
	}
	for(i=0;i<count;i++)
	    a[j++]=0;
	for(i=0;i<n;i++)
	System.out.println(a[i]);
	}
	}
