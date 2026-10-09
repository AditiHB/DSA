package hashingandfrequencymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


//The complement lookup that defines the pattern.
public class TwoSum {
	
	public static void main(String[] args) {
		int[] arr = { 5, 18, 10, 4 }; // input array not sorted
		int target = 15;
		int[] solArr = twoSum(arr, target);
		
		System.out.println(Arrays.toString(solArr));
	}

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0 ; i < nums.length ; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }

}
