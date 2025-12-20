
// Write a java program to add three numbers

package p7_practice_set ;

import java.util.Scanner;
public class exercise1{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:") ;
        int num1 = sc.nextInt();

        System.out.println("Enter second number:") ;
        int num2 = sc.nextInt();

        System.out.println("Enter third number:");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3 ;

        System.out.println("Sum of three numbers you have entered is " +sum );

    }
}

