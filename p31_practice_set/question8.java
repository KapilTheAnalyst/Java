// package p31_practice_set;

public class question8 {

    public static String pattern(int n ){
        if(n==1){
            return "* ";
        }
        return "* " + pattern(n-1) ;

    }
    public static void re_pattern(int n){

        if(n>0){
            re_pattern(n-1) ;

            for(int i=1 ; i<=n ; i++){
                System.out.print("* ") ;
            }
            System.out.println() ; 
        }

    }
    public static void main(String [] args){
        // Print a below pattern by recursion
        // *
        // * *
        // * * *
        // * * * *
        int row = 4 ;

        for(int i=1 ; i<=row ;i++){
            System.out.println(pattern(i)) ;
        }
        System.out.println("New ") ;

        re_pattern(row) ;



    

        
    }

    
}
