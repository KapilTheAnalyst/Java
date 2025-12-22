// package p21_practice_question;

public class exercise {
    public static void main(String [] args){

        // 1. Write a java program to print 
        // the following pattern
        //  * * * *
        //  * * *
        //  * *
        //  *
        // int row = 4 ;

        // for(int i=0;i<row ;i++){
        //     for(int j=i ; j<row ; j++){
        //         System.out.print("* ") ;

        //     }
        //     System.out.println();

        // }

        // 2  Write a program to sum first n even numbers using while loop

    //     int i = 1 ;
    //     int n = 10  ;
    //     int sum = 0; 
    //     while(i <= n){
    //     if(i%2==0){
    //         sum = sum + i ;
           
    // }
    // i++ ;

        // }
        // System.out.println("Sum of first "+ n +" even number be " + sum ) ;

        
        // 3. Write a program to print multiplication table of 10 i

        // int table = 5 ;

        // for(int i = 1 ; i<= 10 ; i++){
        //     System.out.println( table+"*"+i +"="  +table*i);
        // }



        // 4. Write a program to print multiplication table of 10 in reverse order

        // int table = 5 ;

        // for(int i = 10 ; i> 0 ; i--){
        //     System.out.println( table+"*"+i +"="  +table*i);
        // }


        // 5. write a program to find factorial of a given number using for loop
        // 5! = 5*4*3*2*1 ;
        
        // int num = 5 ;
        // int fact = 1 ;
        // for(int i=num ; i>1 ;i--){
        //     fact = fact*i ; 

        // }
        // System.out.println(" Factorial of " + num + " be: " +fact ) ;


        // 6. Write a program to find factorial of a number by while loo

        // int num = 5 ;
        // int i = num  ;
        // int fact = 1 ;

        // while(i>0){
        //     fact = fact * i;
        //     i--;


        // }
        // System.out.println("Factorial of "+ num + " be "+ fact) ;


        // 7. Repeat question 1  while loop
        // int row = 4 ;
        

        // while(row> 0){
        //     int i = row ;
        //     while( i> 0){
        //         System.out.print("* ") ;
        //     i-- ;
        //     }
        //     System.out.println();
        //     row -- ;

        // }


        // 8. Write a program to print the sum 
        // of the numbers occuring in the 
        // multiplication table of 8
        
        // int table = 8 ;
        // int sum = 0; 

        // for(int i=1; i<=10 ; i++){
        //     sum = sum + table*i ;

        // }
        // System.out.println("Sum of all the values of table "+ table + " be " + sum) ;

        // 10. A do while loop is executed:
        // At least once
        // At lesat twice
        // At most once
        // Answer be At least once

        // 11. Repeat 2 using for loop


        int num = 4 ;
        int sum = 0; 

        for (int i = 1 ;i< num ; i++){

            if(i%2==0){
                sum = sum + i ;


            }
        }
        System.out.println("Sum of even numbers between 1 and "+ num + " be " + sum) ;

 

    }
    
}
