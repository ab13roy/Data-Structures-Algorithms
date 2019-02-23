import java.util.*;
import java.lang.*;

class printAnagram{
  static int k = 0;

  public static void main(String args[]){
    String str = enterString();
    System.out.println("Anagrams are");
    anagrams("",str);
    System.out.println("Number of anagrams are "+k);
  }

  public static String enterString(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter String");
    String s = input.next();
    return s;
  }

  public static void anagrams(String a, String b){
    if(b.length()<=1){
      k++;
      System.out.println(a+b);
    }
    else{
      for(int i=0;i<b.length();i++){
        String s1 = b.substring(i,i+1);
        String s2 = b.substring(0,i);
        String s3 = b.substring(i+1);
        anagrams(a+s1, s2+s3);
      }
    }

  }

}
