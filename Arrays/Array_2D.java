import java.util.*;

public class Array_2D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            // memory consumption = row * column * datatype.
            // decleration: 

         //   int[][] array = new int [2][4];
int rows = sc.nextInt();
int columns = sc.nextInt();
// declearation of array
int [][] array = new int [rows][columns];

for ( int i = 0 ; i< rows ; i++){
for ( int j  = 0 ; j< columns ; j++){
    array [i][j] = sc.nextInt();
}
}
for ( int i = 0 ; i< rows ; i++){
for ( int j  = 0 ; j< columns ; j++){
    System.out.print(array[i][j] +" ");
}
System.out.println();
}




        }
    }
}