import java.util.*;

public class infinteloop {
    public static void loop( ){
       ////method 1
        // for (int i  = 0; i>=0; i++){
        //     System.out.println("infine loop");
        // }
        //method 2
        for (;;){
            System.out.println("infinite loop");
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            loop();

         

        }
    }
}
