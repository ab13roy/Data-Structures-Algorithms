import java.util.*;
import java.lang.*;

class subArraySum{

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
    int[] arr = new int[n];
    System.out.println("enter elements of array");
    for(int i=0;i<n;i++){
      arr[i] = input.nextInt();
    }
    return arr;
  }

  public static void findSum(int[] arr, int k){
    int sum=0;
    for (int i=0;i<arr.length ;i++ ) {
      sum =arr[i];
      if((sum == k) && (i == arr.length-1)){
        System.out.println("Sum found at index "+i);
        System.exit(1);
      }
      else{
        for(int j=i+1;j<arr.length;j++){
          sum += arr[j];
          if(sum == k){
            System.out.println("sum found at index "+i+" to "+j);
            System.exit(1);
          }
          else if(sum < k){
            continue;
          }
          else{
            break;
          }
        }
      }
    }
    System.out.println("sum not found in the array");
  }

}
