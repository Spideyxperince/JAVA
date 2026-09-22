import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//declarion of array
int[] oneday = new int[3];
for ( int i = 0; i<oneday.length; i++){
                oneday[i] = sc.nextInt();
            }
System.out.println(Arrays.toString(oneday));



        sc.close();
    }
}