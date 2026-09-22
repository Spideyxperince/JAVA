import java.util.*;

public class TEST_B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

/*
|---------------------------------------------------|
|----------------WRITE YOUR CODE HERE---------------|
|---------------------------------------------------|
*/

        // c = a+b = 1+2
        // b = a. = 1
        // a = c  3 
        int a = 0;
        int b = 1;
            int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            int c = a+b;
            a = b;
            b = c; 
        }
        System.out.print(a);

    
}



        }
    }
