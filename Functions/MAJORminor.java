import java.util.*;
//5. Write a function that takes in age as input and returns if that  is personeligible to vote or not. A person of age > 18 is eligible to vote.

public class MAJORminor {
    public static void age(int ag){
        if(ag>18){
            System.out.println("this son is eligible to vote");
        }else{System.out.println("this person is not eligible to vote");}
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int ag = sc.nextInt();
            age(ag);

        }
    }
}
//// ------------------------ Method 2 ------------------------
// import java.util.*;

// public class MAJORminor {
//     public static boolean req(int age){
//         return 18<age;
//     }
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int age = sc.nextInt();
//             System.out.println(req(age));
            

//         }
//     }
// }