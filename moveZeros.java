class Solution {
    public void moveZeroes(int[] nums) {

        int zeroCounter = 0, position = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zeroCounter++;
            }
            else{
                position++;
                if(zeroCounter==0){
                    continue;
                }
                else{
                    nums[position-1] = nums[i];
                }
            }
        }
        for(int i=nums.length-zeroCounter;i<nums.length;i++){
            nums[i] = 0;
        }

    }
}
