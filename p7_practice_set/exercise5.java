package p7_practice_set;

import java.util.Scanner;
public class exercise5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter a number: ");

        boolean num_int = sc.hasNextInt();

        if(num_int == true){
            System.out.println("Integer.") ;
        }
        else{
            System.out.println("Not a integer.");
        }


    }
    
}
