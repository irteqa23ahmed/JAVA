public class Move_Zero_to_end {
	public static void main(String args[]) {
	int arr[] = new arr[50];
	int n,i,j;
	int temp;
	Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of integer array: ");
        n = scan.nextInt();
        System.out.println("Enter integer array : ");
        for(int i=0;i<n;i++) 
		arr[i]=scan.nextInt();
	j=n-1;
	for(i=0;i<j;i++)
	{
        if(arr[i] == 0)
        {
	for(;arr[j]==0;j--);
        temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
	}
	}
	for(i=0;i<n;i++){
	System.out.println(arr[i]);
	}
	}
	}
