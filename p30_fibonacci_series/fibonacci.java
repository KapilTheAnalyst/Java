// package p30_fibonacci_series;

public class fibonacci {

    public static void main(String [] args){

        // fibonacci series 0 1 1 2 3 5 8 13 21
        int n = 10 ;
        int a1 = 0;
        int a2 = 1 ;
        System.out.print(a1 + " ") ;
        System.out.print(a2+ " ") ;

        for(int i=1 ; i<=n-2 ;i++){
            int a3 = a1+a2 ;
            System.out.print(a3 + " ") ;
            a1 = a2 ;
            a2 = a3 ;
        }


    }
    
}
