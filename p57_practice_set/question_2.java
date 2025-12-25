// package p57_practice_set;
package user_built ;

import java.util.Scanner ;

class A{
    void meth(){
    Scanner sc = new Scanner(System.in) ;
    System.out.println("Share your thoughts: " ) ;
    String s = sc.nextLine() ;
    System.out.println("You thoughts are kept.") ;
    }
}

public class question_2 {
    public static void main(String [] args){
        // Use a built-in-package in java to write a class which 
        // displays a message (by use sout) after taking input from a user

        A a = new A() ;
        a.meth() ;

    }
    
}
