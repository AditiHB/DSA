package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, 4};
		List<List<Integer>> list = threeSum(nums);
		System.out.println(list);

	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		// Sort the array
		Arrays.sort(nums);
		// iterate i upto n-2
		for (int i = 0; i < nums.length - 2; i++) {
			// skip the duplicate of i
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			// set i and j pointers
			int j = i + 1;
			int k = nums.length - 1;

			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum < 0) {
					j++;
				} else if (sum > 0) {
					k--;
				} else { //sum == 0
					list.add(Arrays.asList(nums[i], nums[j], nums[k]));
					while (j < k && nums[j] == nums[j + 1])
						j++; // skip the duplicate of j
					while (j < k && nums[k] == nums[k - 1])
						k--; // skip the duplicate of k

					j++;
					k--;
				}
			}
		}
		return list;
	}

}
