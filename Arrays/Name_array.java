import java.util.*;

public class Name_array{
    // Take an array of names as input from the user and print them on the screen
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
// array decleartion
            int size = sc.nextInt();
            String names[] = new String[size];

// input
            for ( int i = 0; i<names.length; i++){
                names[i] = sc.next();
            }
// output
            for ( int i = 0; i<names.length; i++){
                System.out.println(names[]);
            }
            

        }
    }
}