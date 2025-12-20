// Write a java program which asks user to enter his/her name and greets them
// "Hello<name>", jave a good day" text

package p7_practice_set ;

import java.util.Scanner;
public class exercise3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Hello <" +name+">, have a good day.") ;
        
    }
}