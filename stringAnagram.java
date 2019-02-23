import java.io.IOException;
import java.util.*;

class stringAnagram{

  public static void main(String args[]){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter String 1");
    String str1 = enterString();
    System.out.println("Enter String 2");
    String str2 = enterString();

    boolean flag;
    flag = isAnagram(str1, str2);
    if(flag)
      System.out.println("String2 is an anagram of String1");
    else
     System.out.println("String2 is not an anagram of String1");

  }

  public static String enterString(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter String");
    String s = input.next();
    return s;
  }

  public static boolean generateCount(String a, String b){
    Map<Character, Integer> counts1 = new HashMap<>();
    char temp;
    for(char c: a.toCharArray()){
        counts1.put(c, counts1.containsKey(c)?counts1.get(c)+1:1);
    }

    for(int i=0; i<b.length();i++){
      temp = b.charAt(i);
      if(counts1.containsKey(temp)){
        continue;
      }
      else{
        return false;
      }
    }
    return true;
  }

  public static boolean isAnagram(String string1, String string2){
    boolean test;
    test = generateCount(string1, string2);
    if(test)
      return true;
    return false;
  }

}
