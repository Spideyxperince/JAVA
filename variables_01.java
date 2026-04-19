import java.util.*;

public class variables_01{
    // name can be anything but first letter can not be a number and it can not contain any special character except _ and $.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // i am declaring a variable of type character and there i will store the name.
        String name = "fri-end";  
        // here i am declaring a variable of type integer and there i will store the age.
        int age = 20;
        // here i am declaring a variable of type float and there i will store the height.
        float height = 5.8f; 
        // now we will print the values of these variables.
        System.out.println("my name is " + name + " and my age is " + age + " and my height is " + height);



        

        sc.close();
    }
}