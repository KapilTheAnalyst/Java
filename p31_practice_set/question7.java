// package p31_practice_set;

public class question7 {
    public static String pattern(int n){
        if(n==1){
            return "* " ;
        }
        return "* " + pattern(n-1) ;
    }
    public static void main(String [] args){
        // Print below pattern by recursion
        // * * * *
        // * * *
        // * * 
        // *

        int row = 10 ;

        for(int i=row; i>0 ; i--){

        System.out.println(pattern(i)) ;
    }



    }
    
}
