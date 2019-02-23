import java.util.*;

class oneZeroOne{
  public static void main(String args[]){

    Scanner input = new Scanner(System.in);
    int[] setArr = createArr();
    System.out.println("Enter days");
    int n = input.nextInt();
    setArr = modify(setArr, n);
    for(int i=0;i<setArr.length;i++){
      System.out.println(setArr[i]);
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

  public static int[] modify(int[] array_, int days){
    final int before = 0;
    final int last = 0;
    int size = array_.length;
    int[] copyArr = new int[size];
    int[] copyarr2 = new int[size];

    for (int i=0;i<size ;i++ ) {
      copyArr[i] = array_[i];
      copyarr2[i] = array_[i];
    }

    int prev, next, ops1, ops2;
    for(int i=0;i<days;i++){
      for(int j=0;j<size;j++){
        if(j==0){
          //System.out.println("iteration of i= "+i+" "+"j= "+j);
          prev = before;
          next = copyArr[j+1];
          ops1 = prev | copyArr[j];
          ops2 = copyArr[j] | next;
          /*System.out.println("prev= "+prev);
          System.out.println("next= "+next);
          System.out.println("ops1= "+ops1);
          System.out.println("ops2= "+ops2);*/
          if(prev == next){
            copyarr2[j] = 0;
          }
          else{
            copyarr2[j] = 1;
          }

          /*System.out.println("copyarr2[ "+j+"]= "+copyarr2[j]);
          System.out.println("og");
          for(int k=0;k<size;k++){
            System.out.print(copyArr[k]);
          }
          System.out.println();
          System.out.println("mod");
          for(int k=0;k<size;k++){
            System.out.print(copyarr2[k]);
          }
          break;*/
        }
        else if(j>0 && j<size-1){
          prev = copyArr[j-1];
          next = copyArr[j+1];
          ops1 = prev|copyArr[j];
          ops2 = next|copyArr[j];
          if(prev == next){
            copyarr2[j] = 0;
          }
          else{
            copyarr2[j] = 1;
          }
        }
        else if(j == size-1){
          prev = copyArr[j-1];
          next = last;
          ops1 = prev|copyArr[j];
          ops2 = last|copyArr[j];
          if(prev == next){
            copyarr2[j] = 0;
          }
          else{
            copyarr2[j] = 1;
          }
          //copyArr = copyarr2;
          for (int k=0;k<size ;k++ ) {
            copyArr[k] = copyarr2[k];
          }
        }
      }
    }
    return copyArr;
  }
}
