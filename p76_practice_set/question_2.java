// package p76_practice_set;

import java.util.Scanner ;



public class question_2 {
    public static void introduction(String name){

    if(name.isEmpty()){
        throw new IllegalArgumentException("He He") ;
    }
}
    public static void main(String [] args){
        // 2. Write a java program that prints "Ha Ha" during 
        // Arithmetic exception and "He He" during an illegal arguement exception
        
        try{
            // int a = 34 ;
            // int b = 0;
            System.out.println(90/0) ;
        }
        catch(ArithmeticException e){
            System.out.println("Ha Ha") ;
        }
        introduction("") ;
        


    }
    
}
