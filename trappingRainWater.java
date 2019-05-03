class Solution {
    public int trap(int[] height) {
        int arrLength = height.length;
        int finalArea = 0;
        int[] leftH = new int[arrLength];
        int[] rightH = new int[arrLength];
        int maxHeight = 0;

        if(arrLength>0){
            maxHeight = height[0];
            for(int i=0;i<arrLength;i++){
                if(height[i]<maxHeight){
                    leftH[i] = maxHeight;
                }
                else{
                    leftH[i] = height[i];
                    maxHeight = height[i];
                }
            }

            maxHeight = height[arrLength-1];

            for(int i=arrLength-1;i>=0;i--){
                if(height[i]<maxHeight){
                    rightH[i] = maxHeight;
                }
                else{
                    rightH[i] = height[i];
                    maxHeight = height[i];
                }
            }

            for(int i=0;i<arrLength;i++){
                finalArea += Math.min(leftH[i],rightH[i]) - height[i];
            }

            return finalArea;
        }
        else{
            return finalArea;
        }        
    }
}
