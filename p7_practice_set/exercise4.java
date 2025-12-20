// Write a java program to convert kilometres to miles



package p7_practice_set;

import java.util.Scanner;
public class exercise4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter kilometres:");
        float kilometres = sc.nextFloat() ;

        double miles = kilometres *0.621 ;
        System.out.println(kilometres +" kilometres in miles be " + miles + " miles");


    }

}
