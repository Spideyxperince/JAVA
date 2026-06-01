import java.util.*;

public class TEST_P {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

/*
|---------------------------------------------------|
|----------------WRITE YOUR CODE HERE---------------|
|---------------------------------------------------|
*/

//      *
//     ***
//    *****
//   *******
//  *********
//  *********
//   *******
//    *****
//     ***
//      *
System.out.print("enter the size of diamond ");
                       int n = sc.nextInt();

            for (int i = 0; i<n; i++){

                for (int j = 0 ; j <= n-i; j ++ )
                    System.out.print(" ");
                for (int j = i; j >= 1; j--)
                    System.out.print("*");
                for (int j = 2; j<= i; j++ )
                    System.out.print("*");

                
                System.out.println();

                for (int j = 0 ; j <= n-i; j ++ )
                    System.out.print(" ");
                for (int j = i; j <= 1; j--)
                    System.out.print("*");
                for (int j = 2; j<= i; j++ )
                    System.out.print("*");
            }


        }
    }
}