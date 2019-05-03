import java.util.*;
class Solution {
  public static void main(String[] args) {
		int[] nums = {-2,-1,2,1};
		System.out.println(findMaxSubArraySumEqualsk(nums,1));
	}

	public static int findMaxSubArraySumEqualsk(int[] nums, int k){
		int sum = 0, max = 0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			sum +=  nums[i];
			if(sum>=k){
				max = Math.max(max, i+1);
			}
      //You can store either sum or sum-k, we can use sum-k because when it's 0, we want to use the index value
			int diff = sum -k;
			if(!map.containsKey(diff)){
				map.put(diff,i);
			}else{
				max = Math.max(max, i - map.get(diff));
			}
		}

		return max;
	}
}
