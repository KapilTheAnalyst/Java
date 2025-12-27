// package p76_practice_set;

import java.util.Scanner ;

class MyException extends Exception{
    @Override
    public String toString(){ 
        return "Reached attempts chances." ;
     }
}

public class question_3 {



    public static void getElement(int a[]) throws MyException{

        int attempts = 0 ;
        int maxRetries = 5 ;




    
        while(true){
        try{
            Scanner sc = new Scanner(System.in) ;
            System.out.println("Enter a index of array to fetch an element:") ;
            int index = sc.nextInt() ;
            System.out.println("Your array element be: " + a[index]) ;
            break ;

        }
        catch(Exception e){
            attempts++ ;
            System.out.println("Not a valid index:") ;
            
            
        }
        if(attempts == maxRetries){
            throw new MyException() ;
            // break ;


            // try{

            //     throw new MyException() ;
               
            // }
            // catch(MyException m){
            //     System.out.println(m) ;
            //     break ;
            // }
        
            
        }
        System.out.println("Try again ->") ;
        


    
}

    }









    public static void main(String [] args){
        // Write a program that allows you to keep accessing an 
        // an array until a valid index is given . If max retries 5 print error

        int [] a = new int [5] ;
        a[0] = 5 ;
        a[1] = 6 ;
        a[2] = 7 ;
        a[3] = 8 ;
        a[4] = 9 ;

        try{

            getElement(a) ;
        }
        catch(MyException e){
            System.out.println(e) ;
        }




        



       




          

        
        

    }

    
}
