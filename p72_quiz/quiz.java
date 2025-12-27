// package p72_quiz;

import java.util.Scanner; 

public class quiz {
    public static void main(String [] args){
        // Write a java program that allows you to keep accessing an array until
        // a valid index is given 


        int [] arr = new int[3] ;
        arr[0]  = 12 ;
        arr[1] = 13 ;
        arr[2] = 14 ;

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter index od an array:") ;

        int ind = sc.nextInt() ;
        

        while(true){
            try{

        try{
            System.out.println("Element of an array be: "+arr[ind]) ;
            break ;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry, this index not exists.") ;

        }
        System.out.println("Again enter a index of array: ");
        ind = sc.nextInt() ;

    }
    catch(Exception e){
        System.out.println("Exception in level 2") ;
    }

    }
    System.out.println("Program ends....") ;



        
    }
    
}
