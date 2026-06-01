import java.util.*;

public class else_if {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the first number: ");
            int a = sc.nextInt();
            System.out.print("enter the second number: ");
            int b = sc.nextInt();

            if (a==b)
                System.out.println("a is equal to b ");
            else if (a>b)
                System.out.println("a is greater than b");
            else{
                System.out.println("a is less than b");
            }

            

        }
    }
}