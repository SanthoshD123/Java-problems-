import java.util.*;
import java.util.Arrays;

class Main {

	// Function to find the missing number
	public static int getMissingNo(int[] nums, int n)
	{
		int sum = ((n+1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++)
			sum -= nums[i];
		return sum;
	}

	// Driver code
	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 4, 5 };
		int N = arr.length;
		System.out.println(getMissingNo(arr, N));
	}
}
