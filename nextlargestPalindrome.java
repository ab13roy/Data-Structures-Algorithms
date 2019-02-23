// import java.util.*;
// import java.lang.*;
// //
// // class nextlargestPalindrome{
// //
// //   public static void main(String args[]){
// //     Scanner input = new Scanner(System.in);
// //     int n = enterNum();
// //     findPal(n);
// //
// //
// //   }
// //
// //   public static int enterNum(){
// //     Scanner input = new Scanner(System.in);
// //     System.out.println("enter number");
// //     int n = input.nextInt();
// //     return n;
// //   }
// //
// //   public static void findPal(int n){
// //     int num = n;
// //     String temp = Integer.toString(num);
// //     int length = temp.length();
// //     int firstDigit=0 ;
// //     int lastDigit =0;
// //     firstDigit = n%10;
// //     num /= 10;
// //     while(num!=0){
// //       lastDigit = num%10;
// //       num /= 10;
// //     }
// //     // System.out.println("f"+firstDigit);
// //     // System.out.println("l"+lastDigit);
// //     //(lastDigit !=9) && (firstDigit !=9)
// //     if( !all9s(n)){
// //       if(length == 1){
// //         lastDigit = firstDigit;
// //         System.out.println(lastDigit+""+firstDigit);
// //       }
// //       else if(length == 2){
// //         if(firstDigit == lastDigit){
// //           firstDigit++;
// //           lastDigit++;
// //         }
// //         else {
// //           firstDigit = Math.max(firstDigit, lastDigit);
// //           lastDigit = firstDigit;
// //         }
// //         System.out.println(lastDigit+""+firstDigit);
// //       }
// //       else if(length==3){
// //         num = n;
// //         int a=0;
// //         for(int i=0;i!=length-1;i++){
// //           a = num%10;
// //           num /= 10;
// //         }
// //         if(a!=9){
// //           if(firstDigit == lastDigit){
// //             a++;
// //           }
// //           else{
// //             if((firstDigit > lastDigit)){
// //               firstDigit = lastDigit;
// //               a++;
// //             }
// //             else if ((firstDigit < lastDigit)) {
// //               firstDigit = lastDigit;
// //               //a++;
// //
// //             }
// //
// //           }
// //           System.out.println(lastDigit+""+a+""+firstDigit);
// //         }
// //         //System.out.println("m"+a);
// //       }
// //       else if(length >3){
// //         if(length%2 == 0){
// //           String lHalf, rHalf;
// //           int mid = length/2;
// //           lHalf = temp.substring( 0, mid);
// //           rHalf = lHalf.reverse();
// //           lHalf.append(rHalf);
// //           int tempPal = Integer.parseInt(lHalf);
// //           if(tempPal > n){
// //             System.out.println(tempPal);
// //           }
// //           else{
// //             lHalf = temp.substring( 0, mid);
// //             int lh = Integer.parseInt(lHalf.substring(1,mid));
// //             int x =
// //           }
// //
// //
// //         }
// //       }
// //
// //     }
// //
// //
// //
// //     //System.out.println(lastDigit+""+firstDigit);
// //
// //
// //   }
// //
// //   public static boolean all9s(int n){
// //     boolean flag = true;
// //     while(flag && n!=0){
// //       if(n%10 == 9){
// //         flag = true;
// //         n /= 10;
// //       }else{
// //         flag = false;
// //         break;
// //       }
// //     }
// //     return flag;
// //   }
// //
// //
// // }
//
// class nextlargestPalindrome{
//
//   public static void main(String args[]){
//     int num = enterNum();
//     findPal(num);
//
//   }
//
//   public static int enterNum(){
//     Scanner input = new Scanner(System.in);
//     System.out.println("enter number");
//     int n = input.nextInt();
//     return n;
//   }
//
//   public static void findPal(int n){
//     int num =n;
//     int firstDigit = n%10;
//     int lastDigit = 0;
//     num /= 10;
//     while(num!=0){
//       lastDigit = num%10;
//       num /= 10;
//     }
//     char[] number = Integer.toString(n).toCharArray();
//     String newNum = "";
//     int len = number.length;
//     if(all9s(n)){
//       len++;
//       for(int i=0;i<len;i++){
//         if(i==0 || i==len-1){
//           newNum = newNum.concat("1");
//         }
//         else{
//           newNum = newNum.concat("0");
//         }
//       }
//       System.out.println(newNum);
//     }
//     else{
//       int mid = len/2;
//       int l = mid-1, r=0;
//       boolean nochange = false;
//       if(mid%2 == 0){
//         r = mid;
//       }
//       else{
//         r = mid +1;
//       }
//       do {
//         if( (number[l] == number[r]) && (l>=0 && r<=len-1)){
//           l--;
//           r++;
//           nochange = true;
//         }
//         else{
//           nochange = false;
//           int a = Character.getNumericValue(number[l]);
//           int b = Character.getNumericValue(number[r]);
//           if(a > b){
//             b = a;
//             number[r] = Character.forDigit(a,10);
//             l--;
//             r++;
//           }
//           else{
//             a++;
//             number[l] = Character.forDigit(a,10);
//             number[r] = number[l];
//             l--;
//             r++;
//           }
//         }
//
//       } while ((l>=0) && (r<=len-1));
//       if(nochange){
//
//       }
//       else{
//         // firstDigit = lastDigit;
//         // number[len-1] = Character.forDigit(firstDigit,10);
//         System.out.println(number);
//       }
//     }
//
//   }
//
//   public static boolean all9s(int n){
//     boolean flag = true;
//     while(flag && n!=0){
//       if(n%10 == 9){
//         flag = true;
//         n /= 10;
//       }else{
//         flag = false;
//         break;
//       }
//     }
//     return flag;
//   }
//
// }

import java.util.*;
import java.lang.*;

class nextlargestPalindrome{

  public static void main(String args[]){

    Scanner input = new Scanner(System.in);
    int num = enterNum();
    int[] number = toIntArr(num);
    findPal(num, number);


  }

  public static int enterNum(){
    Scanner input = new Scanner(System.in);
    System.out.println("enter number");
    int n = input.nextInt();
    return n;
  }

  public static int[] toIntArr(int n){
    char[] temp = Integer.toString(n).toCharArray();
    int[] num = new int[temp.length];
    for(int i=0;i<temp.length;i++){
      num[i] = Character.getNumericValue(temp[i]);
    }
    return num;
  }

  public static boolean all9s(int n){
    boolean flag = true;
     while(flag && n!=0){
       if(n%10 == 9){
         flag = true;
         n /= 10;
       }else{
         flag = false;
         break;
       }
     }
     return flag;
  }

  public static void findPal(int a, int[] b ){
    int[] number = b;
    int leng = number.length;
    String ans = "";
    if(all9s(a)){
      for(int i=0;i<=leng;i++){
        if((i==0) || (i==leng)){
          ans = ans.concat("1");
        }
        else{
          ans = ans.concat("0");
        }
      }
      System.out.println(ans);
    }
    else{
      findPal(number);
    }
  }

  public static void findPal(int[] a){
    boolean flag = false;
    int[] num = a;
    int leng = num.length;
    int mid = leng/2;
    int l = 0, r = 0;
    if(leng%2 == 0){
      l = mid -1;
      r = mid;
    }
    else {
      l = mid -1;
      r = mid +1;
    }

    while((l>=0 && r<=leng-1) && (num[l]==num[r] )){
      l--;
      r++;
    }
    if((l < 0) || (num[l] < num[r])){
      flag = true;
    }

    while(l>=0){
      num[r] = num[l];
      l--;
      r++;
    }

    if(flag){
      int c = 1;
      if(leng%2!=0){
        num[mid] += c;
        c = num[mid]/10;
        num[mid] %=10;
        l = mid -1;
        r = mid +1;
        while (l>=0 && r<=leng-1) {
          num[l] += c;
          c = num[l]/10;
          num[l] %= 10;
          num[r] = num[l];
          l--;
          r++;
        }
      }
      if(leng%2 == 0){
        l = mid -1;
        r = mid;
        while (l>=0 && r<=leng-1) {
          num[l] += c;
          c = num[l]/10;
          num[l] %= 10;
          num[r] = num[l];
          l--;
          r++;
        }
      }
    }
    // System.out.println("n :"+num);
    for(int q=0;q<leng;q++){
      System.out.print(num[q]);
    }
    System.out.println();
  }

}
