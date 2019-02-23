import java.util.*;
import java.lang.*;

class subArraySum2{

  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int[] array_ = createArray();
    System.out.println("enter sum");
    int k = input.nextInt();
    findSum(array_, k);
  }

  public static int[] createArray(){
    Scanner input = new Scanner(System.in);
    System.out.println("enter array size");
    int n = input.nextInt();
    int[] arr =  new int[n];
    System.out.println("enter array elements");
    for (int i=0; i<n ; i++ ) {
      arr[i] = input.nextInt();
    }
    return arr;
  }

  public static void findSum(int[] arr, int k){

    int start = 0;
    int sum = arr[0];

    if((sum==k) && (arr.length == 1)){
      System.out.println("Sum found at index 0");
      System.exit(1);
    }

    for (int i=1;i<arr.length ;i++ ) {
      sum +=arr[i];
      while(sum > k){
        sum -= arr[start];
        start++;
      }
      if(sum == k){
        System.out.println("Sum found btwn indexes "+start+" and "+i);
        System.exit(1);
      }
      else if(sum < k){
        continue;
      }
      else{
        System.out.println("sum not found in array");
        System.exit(0);
      }

    }
  }

}
