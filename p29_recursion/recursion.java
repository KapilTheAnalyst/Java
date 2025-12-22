// package p29_recursion;

public class recursion {
    static int factorial(int n){

        if(n==0 || n==1){
            return 1 ;
        }
        else{
            return n*factorial(n-1) ;
        }
        


    }

    static int iterative_factorial(int n){

        if(n==0 || n==1){
            return 1 ;
        }

        else{
        int fact = 1;

        for(int i=1; i<=n ;i++){
            fact = fact * i ;

        }
        return fact ;
    }
        
    }
    public static void main(String [] args){
        // Recursion 
        // A function call itself, such calling is known to be recursion.
        // A recursion have two case
        // A base case
        // A recursive case

        System.out.println("The factorial of 5 be: " + factorial(5)) ;
        System.out.println("The factorial of 5 by iterative be: " + iterative_factorial(5)) ;

    }
    
}
