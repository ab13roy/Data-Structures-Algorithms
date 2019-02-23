import java.util.*;
import java.lang.*;

class numberOfTriangles{

  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int[] sides = createArray();
    int n = findTriangles(sides);
    System.out.println("num of triangles possible is :"+n);
  }

  public static int[] createArray(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter array size");
    int n = input.nextInt();
    if(n<3){
      int[] arr = createArray();
      return arr;
    }
    System.out.println("enter elements");
    int[] arr = new int[n];
    for (int i=0;i<n ; i++) {
      arr[i] = input.nextInt();
    }
    return arr;
  }

  public static int findTriangles(int[] arr){
    Arrays.sort(arr);
    int n = arr.length;
    int k=0, count =0;
    for(int i=0;i<n;i++){
      k = i+2;
      for(int j=i+1;j<n;j++){
        while((k<n) && ((arr[i]+arr[j])>arr[k])){
          System.out.println(arr[i]+" and "+ arr[j]+" and "+arr[k]);
          count++;
          k++;
        }
        k++;
        // if(k>j){
        //    count += k-j-1;
        // }
      }
    }
    return count;
  }

}
