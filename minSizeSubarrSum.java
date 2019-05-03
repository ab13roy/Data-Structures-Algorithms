import java.util.*;
class Solution {
    public static int minSubArrayLen(int s, int[] nums) {

      int[] sumFromRight = new int[nums.length];

      //find if s = single element
      for(int i=0;i<nums.length;i++){
        if(s == nums[i]){
          return 1;
        }
      }
      //Keep adding until currentsum >=s
      ArrayList<Integer> sums = new ArrayList<>();
      int currentsum = 0;
      for(int i=0;i<nums.length;i++){
        currentsum += nums[i];
        sums.add(currentsum);
        if(currentsum>=s){
          break;
        }
      }

      int length = 0, start=0, end=0, midSum = 0;
      end = sums.size()-1;
      while(start <= end){
        midSum  = sums.get(end) - sums.get(start);
        if(midSum >s){
          start++;
        }
        else if(midSum == s){
          start++;
          break;
        }
        else{
          break;
        }
      }

      length = end-start+1;

      return length;

    }

    public static void main(String[] args) {
      int[] nums = {2,3,1,2,4,3};
      int len = minSubArrayLen(7,nums);
      System.out.println("length is : "+len);
    }

}
