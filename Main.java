import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = 5;
        for (int i=0; i<=n;i++){ // yeh 0 se leke 5 tak chalega and i ko output mei dega
//left part
            for(int j = 1 ; j<i;j++){// yeh j ko 1 se leke i -1 tak chalega and print mei * dega
            System.out.print("*");
        }
        //spaces
        int spaces = 2*(n-i); // as we know ki i values 1 , 2 ,3 ,4,5 and n toh constant hai 5
        // so spaces ki values aayegi 8 , 6 , 4 , 2 , and 0 
        for (int j = 1;j <= spaces; j++){ // ab j 1 se start hoga and spaces ki saari values pe 1 - 1 baar condition check karega (8 , 6 ,4, 2 0)
            // so phir voh output mei spaces dega last 2 tak , 0 pe condtion wrong ho jayegi
        System.out.print(" ");
    }

//right part
            for(int j = 1 ; j<i;j++){//  ab yha pe j 1 se start kar rha and i-1 tak condtion check karega
                // i ki values 1 se 5 tak hai 
            System.out.print("*");
            }
            System.out.println();
        }
    
for (int i=5; i>=1;i--){

            for(int j = 1 ; j<i;j++){
            System.out.print("*");
        }
        int spaces = 2*(n-i);
        for (int j = 1;j <= spaces; j++){
        System.out.print(" ");
    }


            for(int j = 1 ; j<i;j++){
            System.out.print("*");

            //just trying to add two codes here

            
            }
            System.out.println();
        }

        sc.close();
    }
    }
