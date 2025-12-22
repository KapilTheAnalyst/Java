// package p31_practice_set;

public class question2 {
    public static void pattern(int row){
        for(int i=1;i<=row ;i++){
            for(int j=1; j<=i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String [] args){
        // Write a program using functions to print the following patter
        // *
        // * *
        // * * *
        // * * * *

        pattern(5) ;
        
        

    }
    
}
