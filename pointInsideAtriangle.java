import java.util.*;
import java.lang.*;

class pointInsideAtriangle{

  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the triangles co-ordinates");
    System.out.println("Enter x1");
    int x1 = input.nextInt();
    System.out.println("Enter y1");
    int y1 = input.nextInt();
    System.out.println("Enter x2");
    int x2 = input.nextInt();
    System.out.println("Enter y2");
    int y2 = input.nextInt();
    System.out.println("Enter x3");
    int x3 = input.nextInt();
    System.out.println("Enter y3");
    int y3 = input.nextInt();
    System.out.println();
    System.out.println("Enter px1");
    int px = input.nextInt();
    System.out.println("Enter py1");
    int py = input.nextInt();

    double areaTriangle = calArea(x1,y1,x2,y2,x3,y3);

    double areaTriangle1 = calArea(px,py,x2,y2,x3,y3);
    double areaTriangle2 = calArea(x1,y1,px,py,x3,y3);
    double areaTriangle3 = calArea(x1,y1,x2,y2,px,py);

    if(areaTriangle == (areaTriangle1+areaTriangle2+areaTriangle3)){
      System.out.println("Point inside triangle");
    }
    else{
      System.out.println("Point outside triangle");
    }

  }

  public static double calArea(int a1,int b1,int a2,int b2,int a3,int b3){
    return (0.5*(a1*(b2-b3)+a1*(b1-b3)+a3*(b1-b2)));
  }


}
