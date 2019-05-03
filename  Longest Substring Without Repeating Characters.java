class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null){
            return 0;
        }
        if(s.length()==0){
            return 0;
        }
         int windowSize = Integer.MIN_VALUE;
        Set<Character> elementsInWindow = new HashSet<>();
        int start = 0, end = 0;

        while(start<s.length() && end<s.length() ) {
            if(!elementsInWindow.contains(s.charAt(end))){
                elementsInWindow.add(s.charAt(end));
                windowSize = Math.max(windowSize, end-start+1);
                end++;
            }
            else{
                elementsInWindow.remove(s.charAt(start));
                start++;
            }
        }
        return windowSize;
    }
}
