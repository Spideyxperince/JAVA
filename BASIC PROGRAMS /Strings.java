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

            //CharAt --> it gives the character at the given index
            for ( int i = 0 ; i<result.length(); i++){
                System.out.println(result.charAt(i));
            }

                //compare the lenght of funtion using compareTO
                String a = "abc";
                String b = "xyz";
                /// here string b is greater than a
                /// because x is greater than a 
                /// so x hold high value than a.
                /// same for b and c wtih y and z respectively.
                if(a.compareTo(b)==0){  // if both string are equal it will return 0
                    System.out.println("string are equal");}
                    else if(a.compareTo(b)>=1){ // if a is greater than b it will return +ve value
                        System.out.println(" string a is bigger than b");
                    }
                    else{ // if b is greater than a it will return -ve value
                        System.out.println("string b is greater than a");
                        
                    }
                    
                    String sentence = "my name is spidey. I am a developer. I love coding , right now I am learning java. ";
                    // substring(beginIndex, endIndex) --> it will give the string from beginIndex to endIndex-1
                    String name = sentence.substring(11,18);// it will give the string from index 11 to 17
                    System.out.println(name);

                    // Strings are immutable
                    
                    
                }   
            }
        
    }
