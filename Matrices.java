import java.util.Scanner;
public class Matrices{ 
    public static void main(String...args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter number of rows: ");
           int r = scanner.nextInt();
           System.out.print("Enter number of columns: ");
           int c = scanner.nextInt();
           int[][] matrix1 =new int[r][c];
           int[][] matrix2 =new int[r][c];
           
           System.out.println("Enter the elements in first matrix :");
           for (int i=0;i<r;i++){
                  for (int j=0;j<c;j++){
                        matrix1[i][j] =scanner.nextInt();
                  }
           }
           System.out.println("Enter the elements in second matrix:");
           for (int i=0;i<r;i++) {
                  for (int j=0;j<c;j++) {
                        matrix2[i][j] =scanner.nextInt();
                  }
           }
           int[][] addMatrix =new int[r][c];
           for (int i=0;i<r;i++) {
                  for (int j=0;j<c;j++){
                        addMatrix[i][j] =matrix1[i][j] + matrix2[i][j];
                  }
           } 
           int[][] subMatrix =new int[r][c];
           for (int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    subMatrix[i][j] =matrix1[i][j]-matrix2[i][j];
                }
            }
            int[][] mulMatrix =new int[r][c];
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    mulMatrix[i][j]=0;
                    for(int k=0;k<r;k++)
                        mulMatrix[i][j]=mulMatrix[i][j]+matrix1[i][k]*matrix2[k][j];
                }
            }
           System.out.println("\nFirst matrix: ");
           for (int i=0;i<r;i++){
                  for (int j=0;j<c;j++){
                        System.out.print("\t"+matrix1[i][j]);
                  }
                  System.out.println();
           }
 
           System.out.println("\nSecond matrix: ");
           for (int i=0;i<r;i++){
                  for (int j=0;j<c;j++){
                        System.out.print("\t"+matrix2[i][j]);
                  }
                  System.out.println();
           }
 
           System.out.println("\nSum: ");
           for (int i=0;i<r;i++){
                  for (int j=0;j<c;j++){
                        System.out.print("\t"+addMatrix[i][j]);
                  }
                  System.out.println();
           }
           System.out.println("\nSubstraction: ");
           for (int i=0;i<r;i++){
                  for (int j=0;j<c;j++){
                        System.out.print("\t"+subMatrix[i][j]);
                  }
                  System.out.println();
           }
           System.out.println("\nMultiplication: ");
            for (int i=0;i<r;i++){
                for (int j=0;j<c;j++){
                    System.out.print("\t"+mulMatrix[i][j]);
                }
            System.out.println();
            }
    }
}