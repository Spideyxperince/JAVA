import java.util.*;

public class TEST {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("entere the lines:");
            int n = sc.nextInt();
           
            // write main logic here
         
//               *      *
//               **    **
//               ***  ***
//               ********
//               ********
//               ***  ***
//               **    **
//               *      *

// for ( int i = 1 ; i <= n ; i++){
//     for ( int j =1 ; j<=i ; j++)// for first inverted triangle
//         System.out.print("*");
//         // loop for spaces 
//         for ( int s = 1; s<= 2*(n-i) ; s++ ){
//             System.out.print(" ");
//         }
//          for ( int j =1 ; j<=i ; j++)// for first inverted triangle
//         System.out.print("*");
//     System.out.println();
// }
// for ( int i = n ; i >= 1; i--){
//     for ( int j =1 ; j<=i ; j++)// for first inverted triangle
//         System.out.print("*");
//         // loop for spaces 
//         for ( int s = 1; s<= 2*(n-i) ; s++ ){
//             System.out.print(" ");
//         }
//          for ( int j =1 ; j<=i ; j++)// for first inverted triangle
//         System.out.print("*");
//     System.out.println();
// }


// rohumbus 

//     *****
//    ***** 
//   *****  
//  *****  
// *****      
        //     //.. for no . of lines 
        //     for ( int i = 1; i<= n; i++){

            
        //     // for spaces
        //     for ( int s = 1 ; s<= n-i; s++){
        //         System.out.print(" ");
        //     }
        //     // for starss
        //     for ( int j = n; j >= 0; j--){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }




            ///--------for number pyramid 
            /// 
            ///     1   
            ///    22
            ///   333
            ///  4444
            

            // for (int i = 1; i<=n ; i++){
            //     // for spaces 
            //     for (int j = 1 ; j<=n-i ; j++){
            //         System.out.print(" ");
            //     }
            //     for (int j =1 ; j<= i; j++ ){
            //         System.out.print(i + " ");
            //     }
            //     System.out.println();
            // }

                /// crazy number pattern 
            /// 
            ///     1   
            ///    212
            ///   32123
            ///  4321234
            
            // for ( int i = 1 ; i <= n ; i++){
            //    // spaces
            //     for ( int j =1 ; j<= n-i; j++){
            //     System.out.print(" ");
            //     }
            //     for (int j = i ; j>= 1 ; j--){
            //         System.out.print(j);
                    
            //     }
            //     for (int j =2 ; j<= i ; j++ ){
            //         System.out.print(j);
            //     }
            //     System.out.println();
                

            // }
            // diamond pattern 

            for ( int i = 1 ; i<= n; i++){
                // spaces 
                for ( int j = 1 ; j <= n-i ; j++){
                    System.out.print(" ");
                }
                // for stars to the left part
for ( int j = 1; j<= i; j++){
    System.out.print("*");
    
}

// for strats to the right part
for ( int j = 2; j <= i ; j++ ){
    System.out.print("*");
}


///inverted part of the 
/// 
/// 


                // spaces 
                for ( int j = 1 ; j <= n-i ; j++){
                    System.out.print(" ");
                }
                // for stars to the left part
for ( int j = 1; j<= i; j++){
    System.out.print("*");
    
}

// for strats to the right part
for ( int j = 2; j <= i ; j++ ){
    System.out.print("*");
}

System.out.println();
}


              } } }