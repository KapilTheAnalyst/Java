// package p73_exception_class;





import java.util.Scanner;

class MyException extends Exception{

    @Override 
    public String toString(){
        // int a = 7 ;
        // int b = 8 ;
        // int multiply = a*b ;
        

        return  "I am toString()" ;
        

    }
    
    @Override
    public String getMessage(){
        
        return  "I am getMessage()" ;

    }

}

public class exception {
    public static void main(String [] args){

        //Exception
        // In java exception is a built in class
        // exception class many methods, which we can overide

        // Some important methods of Exception class

        // 1. String toString() -> executed when we ran System.out.println(e) ;
        // 2. void printStackTrace() -> print stack trace
        // 3. String getMessage() -> 

        // MyException m = new MyException() ;
        // System.out.println(m.toString()) ;
        int a;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a number: ") ;
        a = sc.nextInt() ;

        if(a<9){
            try{
                // throw new MyException() ;
                throw new ArithmeticException("This is an exception") ;

            }
            catch(Exception e){
                System.out.println(e.getMessage()) ;
                System.out.println(e.toString()) ;
                System.out.println(e) ;
                e.printStackTrace() ;
                System.out.println("Finished") ;
 
            }
            System.out.println("Yes, finished") ;
        }

        if(a<10){

            try{
            throw new ArithmeticException("Less than 10") ;

            }
            catch(Exception e){
                System.out.println(e) ;
            }
        }

        // throw keyword is used to to built a custom exception

        System.out.println("Program finished....") ;


    }
    
}
