import java.util.*;

public class Palindorm_Pattern {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            /// crazy number pattern 
            /// 
            ///     1   
            ///    212
            ///   32123
            ///  4321234

            System.out.print(" enter the size of the pattern: ");
            int n = sc.nextInt();

            // loop to print no of lines
            for( int i = 1 ; i<= n ; i++){
                // loop to print spaces
                for ( int j = 1 ; j<= n-i ; j++ )
                    System.out.print(" ");
                for ( int j = i ; j>= 1 ; j--)
                    System.out.print(j);
                // for 2 nd half 
                for ( int j = 2 ; j<= i ; j++){
                    System.out.print(j);
                }
                System.out.println();
        

            }

            

        }
    }
}