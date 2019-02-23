import java.util.*;
import java.lang.*;

class maxDiff{

  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int[] elements = createArray();
    findPair(elements);
  }

  public static int[] createArray(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter array size");
    int n = input.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter elements");
    for(int i=0;i<n;i++){
      arr[i] = input.nextInt();
    }
    return arr;
  }

  public static void findPair(int[] arr){
    int diff = 0;
    int size = arr.length;
    int index1 =0, index2=0;
    for(int i=0;i<size;i++){
      for(int j=i+1;j<size;j++){
        if((arr[j]>arr[i]) && ((arr[j]-arr[i])>diff) ){
          diff = arr[j]-arr[i];
          index1 = i;
          index2 = j;
        }
        else{
          continue;
        }
      }
    }
    if(index1 == index2){
      System.out.println("Not found");
    }
    else{
      System.out.println("Pairs are "+arr[index1]+" at index "+index1+" and "+arr[index2]+" at index "+index2+" with the difference "+diff);
    }

  }

}
