import java.util.*;

public class Inverted_Pyramid{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
System.out.print("enter the size of inverted_pyramid");
int a = sc.nextInt();
for ( int i = 0; i<=a ; i++){
    for (int j = a ; j>i; j-- ){
System.out.print(" ");   //spaces
    }
    for (int k = 1; k<=a ; k++){
        System.out.print("*");
         
    } 
    System.out.println();

}
   
            

        }
    }
}