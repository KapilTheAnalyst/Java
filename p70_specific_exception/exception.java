// package p70_;

import java.util.Scanner ;
public class exception {
    public static void main(String [] args){

        // try mutiple catch block
        int [] marks = new int [3] ;
        marks[0] = 7 ;
        marks[1] = 56 ;
        marks[2] = 6 ;
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("choose a array index for selecting an element: ");
        int ind = sc.nextInt() ;

        System.out.println("Enter a number by which you want to divide a array chosen index element: ");
        int number = sc.nextInt() ;
        

        try{

            System.out.println("The value at array index entered is: " + marks[ind]) ;
            System.out.println("The value of array-value/number is: "+ marks[ind]/number) ;
        }

            catch(ArithmeticException e){
                System.out.println("ArithmeticException occured.") ;
                System.out.println(e) ;
            }
            catch(ArrayIndexOutOfBoundsException e1 ){
                System.out.println("ArrayIndexOfBoundException occured.") ;

            }
            catch(Exception e){
                System.out.println("Soem other exception occured.");
                System.out.println(e) ;
            }




        }
        
    }
    

