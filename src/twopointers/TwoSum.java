package twopointers;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] ans = twoSum(nums, target);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] twoSum(int[] numbers, int target) {
		int low = 0, high = numbers.length - 1;
		while (low < high) {
			int sum = numbers[low] + numbers[high];
			if (target == sum) {
				return new int[] { low + 1, high + 1 };
			}
			if (sum < target) {
				low++;
			} else {
				high--;
			}
		}
		return new int[] { -1, -1 };
	}
}
