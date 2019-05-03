class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        boolean flag = nums1.length > nums2.length? true: false;
        int smallArr = 0, sLength=0, lLength=0;
        if(flag){
            smallArr = 2;
            sLength = nums2.length;
            lLength = nums1.length;
        }
        else{
            smallArr = 1;
            sLength = nums1.length;
            lLength = nums2.length;
        }

        int previousCounter = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();

        if(smallArr == 1){
            for(int i = 0; i < sLength; i++){
                for(int j = previousCounter; j < lLength; j++){
                    if(nums1[i]==nums2[j]){
                        ans.add(nums1[i]);
                        j++;
                        previousCounter = j;
                        break;
                    }
                    else if(nums1[i]<nums2[j]){
                        previousCounter = j;
                        break;
                    }
                    else{
                      continue;
                    }
                }
            }
        }
        if(smallArr == 2){
            for(int i = 0; i < sLength; i++){
                for(int j = previousCounter; j < lLength; j++){
                    if(nums2[i]==nums1[j]){
                        ans.add(nums2[i]);
                        j++;
                        previousCounter = j;
                        break;
                    }
                    else if(nums2[i]<nums1[j]){
                        previousCounter = j;
                        break;
                    }
                    else{
                      continue;
                    }
                }
            }
        }
        int[] finalans = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            finalans[i] = ans.get(i);
        }
        return finalans;
    }
}
