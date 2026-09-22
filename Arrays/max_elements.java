import java.util.*;

public class max_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = { 1 , 5, 4, 99, 3 ,6 };
         int max = arr[0];
          
         for (int i = 0 ; i < arr.length ; i++){
           if ( arr[i] > max){

               max = arr[i];
           }
         }
System.out.println(max);
        sc.close();
    }
}