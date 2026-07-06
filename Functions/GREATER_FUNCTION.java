import java.util.*;

public class GREATER_FUNCTION {
    public static int grtavg(int a  , int b){
        if(a>b){return a;}else{return b;}
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(" enter the first number: ");
            
            int a = sc.nextInt(); 
            System.out.print("enter the second number: ");
            int b = sc.nextInt();
            System.out.println(grtavg(a, b));
        
    
        }
    }
}