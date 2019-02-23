import java.util.Scanner;

class bracesValidator{

  public static void main(String[] args) {
    String A = enterString();
    int counter = braceCount(A);
    if(counter == 0){
      System.out.println("braces are balanced "+" "+counter);
    }
    else
      System.out.println("braces imbalanced "+" "+ counter);

  }

  public static String enterString(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter String");
    String s = input.next();
    return s;
  }

  public static int braceCount(String s){
    int len = s.length();
    int count = 0;
    for(int i=0;i<len;i++){
      if(s.charAt(i)=='{'){
        count++;
      }
      else if(s.charAt(i)=='}'){
        count--;
      }
    }
    return count;
  }

}
