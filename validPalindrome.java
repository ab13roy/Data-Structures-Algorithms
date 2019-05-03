import java.util.*;
import java.io.*;

class Solution{
	public static boolean isPalindrome(String s){
		s = s.replaceAll("\\s+","");
		System.out.println(s + " removed white space");
    s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s + " removed special chars");
    s = s.toLowerCase();
		System.out.println(s + " to lowercase");
		int strLength = s.length();
		System.out.println(strLength + " is the length");
		for(int i=0;i<strLength-1/2;i++){
      if(s.charAt(i) != s.charAt(strLength-1-i)){
        return false;
      }
    }
  return true;
	}


	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		boolean flag = isPalindrome(s);
		System.out.println(flag);
	}
}
