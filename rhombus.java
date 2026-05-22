import java.util.*;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//     *****
//    ***** 
//   *****  
//  *****  
// *****      


int n = 5;
for (int i = 1 ; i<=n ; i++){ // i ki value 1 ,2 ,3 ,4 , 5
   
    for (int j= 0 ; j <= n-i; j++) // yha pe spaces prints honge pheli 4 then 3 then2 so on
        System.out.print(" ");


    for (int j = 0 ; j <= n ;j++  ){

        System.out.print("*");
    }     


    System.out.println();
}
        sc.close();
    }
}
