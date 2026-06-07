import java.util.*;

public class TEST_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number of lines: ");
            int n = sc.nextInt();
            
            int num = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(num);
                    num++;
                }
                System.out.println();
            }

        }
    }
}