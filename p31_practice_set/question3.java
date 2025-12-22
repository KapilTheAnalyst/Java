// package p31_practice_set;

public class question3 {
    public static int sum(int n ){
        if(n==1){
            return 1 ;
        }
        else{
            return n+sum(n-1) ;
        }
    }
    public static void main(String [] args){
        // Write a recursive function to calculate sum of
        // first n natural numbers
        int n = 10  ;

        System.out.println("Sum of "+ n + " natural numbers be: " +sum(n)) ;

    

    }
    
}
