class Solution {
    public int numDecodings(String s) {

        int[] nums = new int[s.length()+1];

        nums[0] = 1;
        nums[1] = s.charAt(0) == '0'? 0:1;
        for(int i=2;i<=s.length();i++){
            int one = Integer.valueOf(s.substring(i-1,i));
            int two = Integer.valueOf(s.substring(i-2,i));
            if(one >=1){
                nums[i] += nums[i-1];
            }
            if(two>=10 && two <=26){
                nums[i] += nums[i-2];
            }
        }

        return nums[s.length()];
    }
}


//0ms solution
// class Solution {
//     public int numDecodings(String s) {
//
//         if(s.length() == 0) return 0;
//     int pre = 27, digit, answer = 0, first = 1, second = 1;
//     for(int i = s.length()-1; i >= 0; i--){
//         digit = s.charAt(i) - '0';
//         if(digit == 0) answer = 0;
//         else answer = first + (digit*10 + pre < 27 ? second : 0);
//         second = first; first = answer; pre = digit;
//     }
//     return answer;
//
//     }
//
// }
