import java.util.*;
class lcdOfGcds{

  public static void main(String args[]){

    int[] nums= createArr();
    int size = nums.length;
    int[] gcdNums = new int[size-1];
    //System.out.println("Calling GCDS");
    for(int i=0;i<size-1;i++){

      if(i+1 == size){
        break;
      }
      else{
        //System.out.println(nums[i]+" "+nums[i+1]);
        gcdNums[i] = findGDC(nums[i], nums[i+1]);
        continue;
      }
    }

    /*System.out.println("nums are");

    for(int i=0;i<size;i++){
      System.out.print(nums[i]);
    }

    System.out.println();*/

    gcdNums = sortGCD(gcdNums);
    int min = gcdNums[0];

    /*System.out.println("gcds are");

    for(int i=0;i<size-1;i++){
      System.out.print(gcdNums[i]);
    }*/

    //System.out.println("lcds");
    for(int i=0;i<size-1;i++){
      if(gcdNums[i]%min == 0){

        //System.out.println(gcdNums[i]+" "+min);
        continue;
      }
      else{
        min = 1;
        break;
      }
    }

    System.out.println("LCD of GCDS = "+min);



  }

  public static int[] createArr(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size");
    int n = input.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter elements");
    for(int i = 0; i<n; i++){
      arr[i] = input.nextInt();
    }
    return arr;
  }

  public static int findGDC(int num1,int num2){
      if(num2 == 0)
        return num1;
      else
        return findGDC(num2, num1%num2);
  }

  public static int[] sortGCD(int[] arr){
    int size = arr.length;
    int temp;
    for(int i=0;i<size;i++){
      for(int j=1;j<size-i-1;j++){
        if(arr[j-1]>arr[j]){
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }

}
