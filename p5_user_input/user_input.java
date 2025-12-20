
// Java uses scanner class to take input fro user

package p5_user_input ;
import java.util.Scanner;
public class user_input{
    public static void main(String [] args){
        System.out.println("Taking input from user") ;

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number 1");
        // int a = sc.nextInt();

        // System.out.println("Enter number 2");
        // int b = sc.nextInt();
        // float f = sc.nextFloat();

        // int sum = a+b ;
        
        // System.out.println("Sum of these numbers be:") ;
        // System.out.println(sum);
        // boolean bool = sc.hasNextInt();
        // System.out.println(bool) ;

        String str = sc.nextLine(); // taking string as a input



    }
}


// we created a object of Scanner class
// Scanner sc = new Scanner(System.in)
// Scanner is a name of class
// new(Scanner.in) means creating a new object
// System.in means we read from keyword
