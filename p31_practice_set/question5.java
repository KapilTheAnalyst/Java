public class question5 {

    public static int fibonacci(int n){
        if(n==0){
            return 0 ;
        }
        if (n==1){
            return 1 ;
        }
        return fibonacci(n-1) + fibonacci(n-2) ;
    }
    public static void main(String [] args){
        // Write a function to print nth term of fibonacci series
        // using recursion 

        // fibonacci series 0 1 2 3 5 8 13 21 34 55

        int n = 18 ;

        for(int i =0; i<n ; i++){
            System.out.print(fibonacci(i) + " ") ;
        }
    }
    
}
