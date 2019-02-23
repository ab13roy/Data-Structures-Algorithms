import java.util.*;
import java.lang.*;

class setDivisbleByK{

  public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    int[] numSet = createArray();

    System.out.println("Enter K");
    int k = input.nextInt();

    findPairs(numSet, k);

  }

  public static int[] createArray(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Size of array");
    int n = input.nextInt();
    if(n%2!=0){
      System.out.println("Not an even size");
      System.exit(0);
    }
      System.out.println("Enter array elements");
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
        System.out.println("Element : "+i);
        arr[i] = input.nextInt();
      }
      return arr;
  }

  public static void findPairs(int[] arr, int x){
    int k = x;
    int size = arr.length;
    int num1, num2;
    for(int i=0;i<size;i++){
      for(int j=i+1;j<size;j++){
        num1 = arr[i];
        num2 = arr[j];
        if((num1+num2)%k == 0){
          System.out.println("Pairs are "+num1+" and "+num2);
        }
      }
    }
  }

}
