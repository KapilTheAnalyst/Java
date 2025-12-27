// package p69_try_catch;

public class try_catch {
    public static void main(String [] args){

       
        
        // Types of exception
        // checked Exception 
        //Unchecked Exception

        // checked Exception 
        // checked Exceptions are compiled time exceptions, compiler detect these exception

        // unchecked exceptions
        // exceptions occur at runtime known to bw unchecked exception.

        // try-catch block 
        // try-catch block are used to handle exceptions


        int a = 6000 ;
        int b = 0 ;
        // int c = a/b ;

        try{
        int c = a/b ;
        System.out.println("The result be: "+ c) ;
        }
        catch(Exception e){
            System.out.println("We failed to divide reason: " ) ;
            System.out.println(e) ;
        }
        System.out.println("End a program ") ;

    }
    
}
