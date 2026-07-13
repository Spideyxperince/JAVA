import java.util.*;
//Take a 2D array (matrix) as input from the user. 
// Then take a number x as input. 
// Search for x in the matrix.
//  If it is found, print its row and column index.

public class Matrix_Search{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        
            // input of rows and column of matrix
      int rows = sc.nextInt();
      int cols = sc.nextInt();

      // decelaration
      int matrix [][] = new int [rows][cols];

      //input 
      for ( int i = 0 ; i< rows ; i++ ){
        for (int j = 0 ; j< cols ; j++ ){
            matrix [i][j] = sc.nextInt();
        }
      }

      // output

      for ( int i = 0 ; i< rows ; i++ ){
        for (int j = 0 ; j< cols ; j++ ){
            System.out.print(matrix[i][j] + "  ");

        }
      System.out.println();
      }
// matrix search 
  int x = sc.nextInt();
             for ( int i = 0 ; i< rows ; i++ ){
        for (int j = 0 ; j< cols ; j++ ){
               if (matrix[i][j] == x){
                System.out.println("found: "+" row " + i + " column " + j);
               }
            }


            

        }
    }
    }}