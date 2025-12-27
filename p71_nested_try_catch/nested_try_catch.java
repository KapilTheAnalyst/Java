// package p71_nested_try_catch;


import java.util.*;

public class nested_try_catch {
    public static void main(String []args){
        int [] marks = new int[3] ;

        marks[0] = 7 ;
        marks[1] = 56 ;
        marks[2] = 6 ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a index of a array:") ;
        int ind = sc.nextInt() ;

        try{
            System.out.println("Welcome to video") ;

            try{
                System.out.println(marks[ind]) ;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exists.") ;
                System.out.println("Exception in level 2") ;
            }


        }
        catch(Exception e){
            System.out.println("Exception is level 1 " );
        }
        System.out.println("End a program.") ;



    }
    
}
