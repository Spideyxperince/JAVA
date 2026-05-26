import java.util.*; 
public class diamond_pattern {

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

//      *
//     ***
//    *****
//   *******
//  *********
//  *********
//   *******
//    *****
//     ***
//      *
int n = 5;
for (int i = 1; i <= n; i++){

//yha pe iss loop se toh line create hongi


    for (int j = 0 ; j <= n-i; j++){
        //iss loop se spaces create honge n-1 
        // yani phele 4 then 3 and so on
        System.out.print(" ");
    }

    for (int j = i; j >=1;j--){
        // iss loop se j ki starting i se hori hai means 1 and to 5
        System.out.print("*" );
    }
     for (int j = 2; j <=i;j++){
        System.out.print("*"  );
     }
System.out.println();




}
for (int i = n; i >= 1 ; i--){
     for (int j = 0 ; j <= n-i; j++){
        //iss loop se spaces create honge n-1 
        // yani phele 4 then 3 and so on
        System.out.print(" ");
    }

    for (int j = i; j >=1;j--){
        // iss loop se j ki starting i se hori hai means 1 and to 5
        System.out.print("*" );
    }
     for (int j = 2; j <=i;j++){
        System.out.print("*"  );
     }
System.out.println();

          sc.close();
      }
  }  
}

