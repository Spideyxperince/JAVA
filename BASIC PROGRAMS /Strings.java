import java.util.*;

public class Strings{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
           // declearation of String and addition
           
            String para = "spidey";
            System.out.print("enter a word:");
            String graph = sc.next();
            String result = para+"is a"+graph;
            System.out.println(result);

            // lenght function- calc. the number of char
            System.out.println(result.length());

            //CharAt
            for ( int i = 0 ; i<result.length(); i++){
                System.out.println(result.charAt(i));

                //compare the lenght of funtion using compareTO
                String a = "hallo";
                String b = "hallo9";
                if(a.compareTo(b)==0){
                    System.out.println("string are equal");}
                    else if(a.compareTo(b)>=1){
                        System.out.println(" string a is bigger than b");
                    }
                    else{
                        System.out.println("string b is greater than a");
                    }
                    

                }
            }
        
    }}
