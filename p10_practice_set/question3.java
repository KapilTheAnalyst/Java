// write a java program to find out whether a given number is greater than
// than the user entered number or not

package p10_practice_set;
import java.util.Scanner;
public class question3{
    public static void main(String []args){
        System.out.println("Running") ;

        int number = 89 ;

        Scanner s = new Scanner(System.in) ;
        System.out.println("Enter a number: ");
        float f = s.nextFloat();

        System.out.println("user number is greater than defined number "+ f>number );
        System.out.println(  f>number) ;
       


    }
}