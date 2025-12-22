
package p16_switch_statement ;
import java.util.Scanner;
public class switchh{
    public static void main(String [] args){

        int age ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();

        // if(age >56){
        //     System.out.println("You are experienced.");

        // }
        // else if(age>46){
        //     System.out.println("You are semi-experienced.");
        // }
        // else if(age>36){
        //     System.out.println("You are semi-semi-experienced");
        // }
        // else{
        //     System.out.println("You are not experienced.");
        // }

        /* 

        switch(age){
            case 18:
                System.out.println("You are going to become adult.");
                break;
            
            case 23:
                System.out.println("You are going to join job.");
                break;

            case 60:
                System.out.println("You are going to retired.");
                break;

            default:
                System.out.println("Enjoy your life") ;
        }

        */

        // Enhanced switch statement:

        switch(age){

            case 18 ->{
                System.out.println("You age is 18");
            }

            case 25 ->{
                System.out.println("Your age is 25");
            }

            default -> {
                System.out.println("I do not know your age") ;
            }
        }



        

        
    }
}