import java.util.Scanner;
class multiBraceValidator{

  public static void main(String args[]){

    String a = enterString();

    boolean flag = braceCount(a);

    if(flag){
      System.out.println("Balanced");
    }
    else
      System.out.println("Imbalanced");

  }

  public static String enterString(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter String");
    String s = input.next();
    return s;
  }

  public static boolean braceCount(String s){
    int len = s.length();
    StringBuilder newS = new StringBuilder();
    int count = 0;
    for(int i=0;i<len;i++){

      switch (s.charAt(i)) {
        case '{':
          newS.append('{');
          System.out.println(newS);
          break;
        case '[':
          newS.append('[');
          System.out.println(newS);
          break;
        case '(':
          newS.append('(');
          System.out.println(newS);
          break;
        case '<':
          newS.append('<');
          System.out.println(newS);
          break;
        case '}':
          if(newS.charAt(newS.length()-1) == '{'){
            newS.deleteCharAt(newS.length()-1);
            System.out.println(newS);
          }

          break;
        case ']':
          if(newS.charAt(newS.length()-1) == '['){
            newS.deleteCharAt(newS.length()-1);
            System.out.println(newS);
          }
          break;
        case ')':
          if(newS.charAt(newS.length()-1) == '('){
            newS.deleteCharAt(newS.length()-1);
            System.out.println(newS);
          }
          break;
        case '>':
          if(newS.charAt(newS.length()-1) == '<'){
            newS.deleteCharAt(newS.length()-1);
            System.out.println(newS);
          }
          break;

        default:
          continue;
      }

    }
    if(newS.length()==0){
      return true;
    }
    return false;
  }


}
