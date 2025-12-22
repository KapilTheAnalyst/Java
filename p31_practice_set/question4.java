// package p31_practice_set;

public class question4 {
    public static void pattern(int row){

        for(int i=1; i<=row;i++){
            for(int j=row ; j>i ; j--){
                System.out.print("* ");
            }
            System.out.println() ;
        }
    }
    public static void main(String [] args){
        // Write a function to print the following pattern
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        int row = 10 ;
        pattern(10) ;

    }
    
}
