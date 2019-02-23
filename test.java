import java.util.*;

class test{
  public static void main(String args[]){
    int[] setArr = createArr();
    int[] newArr = setArr;
    int size = setArr.length;
    for (int i=0;i<size ;i++ ) {
      newArr[i]=-1;
    }
    System.out.println("og");
    for (int i=0;i<size;i++ ) {
      System.out.print(setArr[i]);
    }
    System.out.println();
    for (int i=0;i<size ;i++ ) {
      System.out.print(newArr[i]);
    }
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
  /*public static void copyArr(int[] array_){
    int size = array_.length;
    int[] copyarr2 = new int[size];
    for(int i=0;i<size;i++){
      if(array_[i]==1){
        copyarr2[i]=2;
      }
      else{
        copyarr2[i]=array_[i];
      }
    }
    System.out.println("og");
    for (int i=0;i<size;i++ ) {
      System.out.print(array_[i]);
    }
    System.out.println();
    for (int i=0;i<size ;i++ ) {
      System.out.print(copyarr2[i]);
    }

  }*/
}
