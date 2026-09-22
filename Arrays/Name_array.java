import java.util.*;

public class Name_array{
    // Take an array of names as input from the user and print them on the screen
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
// array decleartion...
//---------------------------------------------------------
// type[] array_name = new type[size]; 
//---------------------------------------------------------
// --> type = int, float, double, char, String, boolean
// --> size = number of elements in the array

           int[] first_array = new int[5];

           // input in array...
            first_array[0] = 43;
            first_array[1] = 23;

             //another way to give output


             for (int i = 0; i <first_array.length; i++){
                first_array[i] = sc.nextInt();

             }
         //  ----------------- output ----------------
            System.out.println(first_array); // this will print a garbage value.

            System.out.println(first_array[0]);
            System.out.println(first_array[1]);
            System.out.println(first_array[2]);
            //another way to give output
            System.out.println("output using for loop");
            for(int i = 0 ; i < first_array.length; i++){
                System.out.println(first_array[i]);

            }
//---------------------------------------------------------
// another way to define a array
//---------------------------------------------------------

//---------------------------------------------------------
// type[] array_name = {};
//---------------------------------------------------------

int[] second_array  = {1 ,21 , 443 , 43 , 19 , 143 };
for ( int a = 0;  a < second_array.length ; a++){
    System.out.println(second_array[a]);
}
            
        }

    }
}