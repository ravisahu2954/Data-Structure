Input: arr[] = {4, 8, 12, 16} 
Output: 28 
(12, 16) is the pair with the maximum bitwise OR. 
12 | 16 = 28


import java.util.Arrays;

class Main{

public static int maxOR(int[] arr, int n)
{
	

	int max_value = Arrays.stream(arr).max().getAsInt();
	

	int ans =0;
	for(int i = 0; i < n; i++)
	{
		ans = Math.max(ans, (max_value | arr[i]));
	}
	return ans;
}

public static void main(String[] args)
{
	int arr[] = { 3, 6, 8, 16 };
	int n = arr.length;
	
	System.out.print(maxOR(arr, n));
}
}

TIME COMPLEXITY : 0(n log(n))

 
