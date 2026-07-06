import java.util.*;
//4. Write a function that takes in the radius as input and returns the circumference of a circle.

public class CIRCUMFERENCE {
    public static int radius( int r ){
       
        return(int)( 2 * 3.14 * r);   
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int r =  sc.nextInt();
        System.out.println("circumference in whole value: "+radius(r));
        }
    }
}