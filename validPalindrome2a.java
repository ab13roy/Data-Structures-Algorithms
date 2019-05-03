//Works :)
class Solution {
    public static boolean validPalindrome(String s) {
        int sLength = s.length();
        System.out.println("original length = "+sLength);
        for(int i=0;i<sLength/2;i++){
            if(s.charAt(i) != s.charAt(sLength-1-i)){
                int j = sLength-1-i;
                System.out.println("value of j = "+j);
                boolean flag1 = restPalindrome(s.substring(i+1, j+1));
                System.out.println(s.substring(i+1,j+1));
                boolean flag2 = restPalindrome(s.substring(i, j));
                System.out.println(s.substring(i,j));
                boolean result = flag1 || flag2;
                System.out.println("value of flag1 = "+flag1);
                System.out.println("value of flag2 = "+flag2);
                return result;
            }
        }
        System.out.println("nothing wrong LUL");
        return true;
    }

    public static boolean restPalindrome(String s){
        int sLength = s.length();
        for(int i=0;i<sLength/2;i++){
            if(s.charAt(i)!=s.charAt(sLength-1-i)){
                System.out.println("checking chars = "+s.charAt(i)+" and "+s.charAt(sLength-1-i));
                return false;
            }
            else{
              System.out.println("checking chars = "+s.charAt(i)+" and "+s.charAt(sLength-1-i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
      String s = "abcabbba";
      boolean a = validPalindrome(s);
      System.out.println("final ans =" + a);
    }
}
