import java.util.*;
import java.lang.*;

class majorityElement{

  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int[] numbers = createArray();
    int n = findMaj(numbers);
    if(n == 0 ){
      System.out.println("no major element");
    }

  }

  public static int[] createArray(){
    Scanner input = new Scanner(System.in);
    System.out.println("enter array size");
    int n = input.nextInt();
    int[] arr = new int[n];
    System.out.println("enter elements");
    for(int i=0;i<n;i++){
      arr[i] = input.nextInt();
    }
    return arr;
  }

  public static int findMaj(int[] arr){
    Arrays.sort(arr);
    Map<Integer, Integer> maps = new HashMap<>();
    int n = arr.length;
    int count =0;
    for(int i=0;i<n;i++){
      if(maps.containsKey(arr[i])){
        int c = maps.get(arr[i]);
        c++;
        maps.put(arr[i], c);
      }
      else{
        maps.put(arr[i], 1);
      }
    }
    n = n/2;

    Set<Integer> i = maps.keySet();
    for(int e: i){
      count = maps.get(e);
      if(count > n){
        System.out.println("number is: "+e+" count: "+count);
        return count;
      }
    }

    return count;
  }

}
