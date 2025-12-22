// package p17_practice_set;

import java.util.Scanner;
public class practice_set {
    public static void main(String [] args){

        // What will be the output of this program"
        // int a = 10 ;
        // if(a==11)
        // System.out.println("I am 11");
        // else
            // System.out.println("I am not 11");

        // int a = 10 ;

        // if(a==11){
        //     System.out.println("I am 11");
        // }
        // else{
        //     System.out.println("I am not 11");
        // }

        // Write a program to find out whether
        // a student is pass or fail. If it requires total 40 % and atleast 
        // 33 % in each subject to pass.Assume 3 subkects and take marks as an input from the user.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter marks of subject 1: ");

        // float marks1 = sc.nextFloat();

        // System.out.println("Enter marks of subject 2: ");
        // float marks2 = sc.nextFloat();

        // System.out.println("Enter marks of subject 3: ");
        // float marks3 = sc.nextFloat();

        // float total = marks1 + marks2 + marks3 ;

        

        // float percent = total*100/300  ;

        // if(marks1 >=33 && marks2 >= 33 && marks3>=33 && percent >= 40){
        //     System.out.println("Pass, with percentage " + percent);
        // }
        // else{
        //     System.out.println("Fail");
        // }

        // Calculate income tax paid by an employee to the government as per the slabs
        // mentioned below:
        // Income slab     Tax
        // 2.5L             5%
        // 5.0L-10.0L        20 %
        // Above 10.0L       30%

        // int income = 1000000;
        // float tax = 0; 
        

        // if(income>1000000){
        //     tax = .30f*income ;
        //     System.out.println("tax be 30 percent, which is "+ tax);
            
            
        // }
        // else if(1000000 >= income || income>500000){
        //     tax = .20f*income ;
        //     System.out.println("Tax be 20 percent, which is " + tax);

        // }
        // else if(500000>=income || income>250000){
        //     tax = .05f*income ;
        //     System.out.println("Tax be 5 percent, which is "+ tax);
        // }
        // else{
        //     System.out.println("No tax");
        // }

        // Write a java program to find out the day of the week given
        // the number [1 for Monday, 2 for Tuesday and so on]

        // String day = "Friday" ;
       


        // switch(day){

        //     case "Monday" ->{
        //         System.out.println("1") ;

        //     }
        //     case "Tuesday" ->{
        //         System.out.println("2");
        //     }
        //     case "Wednesday" ->{
        //         System.out.println("3") ;
        //     }
        //     case "Thursday" ->{
        //         System.out.println("4") ;
        //     }
        //     case "Friday" ->{
        //         System.out.println("5") ;
        //     }
        //     case "Saturday" ->{
        //         System.out.println("6");
        //     }
        //     case "Sunday" ->{
        //         System.out.println("7") ;
        //     }
        // }

        // Write a java program to find out the the type of website from the url

        String web = "0221dcsds147@niet.co.in" ;

        if(web.endsWith(".com")){
            System.out.println("Commercial website") ;
        }
        else if(web.endsWith(".org")){
            System.out.println("Organisation website");
        }
        else if(web.endsWith(".in")){
            System.out.println("Indian website.");
        }
        else{
            System.out.println("Other websites") ;
        }






    }
    
}
