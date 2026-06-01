import java.util.*;

public class Switch_Case {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
switch (a) {
    case 1:
        System.out.println("nameste");
        
        break;
        case 2:
        System.out.println("hello");
        break;
        case 5:
        System.out.println("bonjour");

    default:
        System.out.println("invalid");

        break;
         

}

        }
    }
}