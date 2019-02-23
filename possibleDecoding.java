import java.util.*;
import java.lang.*;

class possibleDecoding{

  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int[] numbers = createArray();
    int n = findCount(numbers);
    System.out.println("count is: "+n);

  }

  public static int[] createArray(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter array size");
    int n = input.nextInt();
    System.out.println("enter elements");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = input.nextInt();
      if( arr[i]>9 || arr[i] <0){
        System.out.println("not allowed");
        System.exit(0);
      }
    }
    return arr;
  }

  public static int findCount(int[] arr){
    int count = 1;
    int len = arr.length;
    int i=0,j=0;
    int num=0;
    // boolean flag1 = false, flag2 = false;
    // for(i=0;i<len;i++){
    //   j = i+1;
    //   if(arr[i]==0 && arr[j]==0 && j<len){
    //     flag1 = true;
    //   }
    // }
    // if(arr[len-1]==0){
    //   flag2 = true;
    //   len--;
    // }
    while(i<len){
      j = i+1;
      if(j<len){
        num = arr[i]*10 + arr[j];
        if(num<=26){
          count++;
          i+=2;
        }
        else{
          i++;
        }
      }
      else{
        break;
      }
    }
    // if(len%2==0){
    //   return count;
    // }
    if(arr[len-1]==0){
      len++;
    }
    i=len-1;
    j=0;
    while(i>=0){
      j = i-1;
      if(j>=0){
        if(arr[j]==0){
          i-=2;
        }
        else {
          num = arr[j]*10 + arr[i];
        }
        if(num<=26){
          count++;
          i-=2;
        }
        else{
          i--;
        }
      }
      else {
        break;
      }
    }
    //
    // if(flag1 || flag2){
    //   count /=2;
    // }

    return count;

  }

}
