import java.util.*;
import java.lang.*;

class longestRepeatingSubsequence{

  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    String str = createString();
    int n = lrs(str);
    if(n!=0){
      System.out.println("longest Repeating Subsequence is :"+n);
    }else {
      System.out.println("no longest Repeating Subsequence found");
    }
  }

  public static String createString(){
    Scanner input = new Scanner(System.in);
    System.out.println("enter string");
    String s = input.next();
    return s;
  }

  public static int lrs(String s){
    int count = 0;
    int maxCount = count;
    char[] ch = s.toCharArray();
    int len = s.length();
    int i=0, j=0;
    while(i<len-1){
      j = i+1;
      if(ch[i]==ch[j]){
        count++;
        maxCount = (count>maxCount)? count: maxCount;
        i = ++j;
      }
      else{
        i++;
      }
    }
    return maxCount;
  }


}
