//Works :)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int sizeArr = nums.length;
        ArrayList<List<Integer>> result = new ArrayList<>();
        int a =0, b=0,c=0,start=0,end=0;
        //a+b=c idea

        Arrays.sort(nums);

        for(int i=0;i<=sizeArr-3;i++){
            start = i+1;
            end = sizeArr-1;
            while(start<end){
                a = nums[i];
                b = nums[start];
                c = nums[end];
                if((a+b+c)==0){
                    ArrayList<Integer> listOfNums = new ArrayList<>();
                    listOfNums.add(a);
                    listOfNums.add(b);
                    listOfNums.add(c);
                    if(!(result.contains(listOfNums))){
                        result.add(listOfNums);
                        start++;
                    }
                    else{
                        start++;
                    }
                }
                else if((a+b+c)>0){
                    end--;
                }
                else if((a+b+c)<0){
                    start++;
                }
                else{
                    break;
                }
            }
        }

        return result;
    }
}
