public class Move_Zero_to_end {
	public static void main(String args[]) {
	int arr[] = {4,3,2,0,1,0,9,0,78,0,0,12,34,0,0,1,0,8,7,6,0,4,3,2};
	int n,i,j;
	int temp;
	n = arr.length;	
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
