import java.util.*;

// 2. Write a function to print the sum of all odd numbers from 1 to n.
public class FUNCTION_ODD {
    public static int sumodd(int n){
       int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {  // Check if number is odd
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number n: ");
            int n = sc.nextInt();
            int result = sumodd(n); 
            System.out.println("Sum of all odd numbers from 1 to " + n + " is: " + result);
        }
    }
}