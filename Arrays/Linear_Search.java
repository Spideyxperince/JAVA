import java.util.*;

public class Linear_Search {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int size = sc.nextInt();
            int numbers[] = new int[size];

            // input
            for ( int i = 0; i<numbers.length; i++){
                numbers[i] = sc.nextInt();
            }
            // output 

            for ( int i = 0 ; i<numbers.length; i++){
                System.out.println(numbers[i]);
            }

            // search 
            int x = sc.nextInt();
            for (int i =1 ; i< size; i++){
               if (numbers[i] == x){
                System.out.println("found: "+ i);
               }
            }

        }
    }
}