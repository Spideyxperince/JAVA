import java.util.*;

public class Number_pyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print(" enter the number of size : ");
            int n = sc.nextInt(); 
            

            ///--------for number pyramid 
            /// 
            ///     1   
            ///    22
            ///   333
            ///  4444
            
            for ( int i = 1 ; i <= n; i++){
                // for spaces 
                for ( int j = 1 ; j <= n-i; j++)
                    System.out.print(" ");
                // for numbers 
                for( int j =1 ; j<= i; j++){
                System.out.print(i + " ");
                }
                System.out.println();
            }

        }
    }
}