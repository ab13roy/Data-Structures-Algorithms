import java.util.Scanner;

class matrixSpiralPrint{

  public static int[][] createMatrix(){

    Scanner input = new Scanner(System.in);

    int i,j=0;

    System.out.println("Enter dimension 1");
    i = input.nextInt();
    System.out.println("Enter Dimension 2");
    j = input.nextInt();
    int[][] matrix = new int[i][j];
    System.out.println("Enter items");
    for(int a=0; a<i;a++){
      for(int b=0;b<j;b++){
        matrix[a][b]=input.nextInt();
      }
    }
    return matrix;

  }

  public static void printSpiral(int[][] mat){

    int dim1 = mat.length;
    int dim2 = mat[0].length;
    System.out.println("dim1 = "+dim1);
    System.out.println("dim2 = "+dim2);

    for(int i=0;i<dim1;i++){
      if(i%2 == 0){
        for(int j=0;j<dim2;j++){
          System.out.println(i+" "+j+" = "+mat[i][j]);
        }
      }
      else if (i%2==1) {
        for(int j=dim2-1;j>=0;j--){
            System.out.println(i+" "+j+" = "+mat[i][j]);
        }
      }
    }


  }

  public static void main(String args[]){

    Scanner input = new Scanner(System.in);

    int[][] matrix = createMatrix();
    printSpiral(matrix);
  }


}
