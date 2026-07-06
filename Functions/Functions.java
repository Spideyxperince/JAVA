import java.util.*;

public class Functions {
    public static int addition (int a , int b){
        return a+b;
    }


    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(addition(a, b));

        }
    }
}