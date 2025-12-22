// package p25_practice_set;

public class question2 {
    public static void main(String [] args){

        // Write a program to find out whether a given integer
        // is present in an array or not

        int num = 59 ;

        int[] arr = {1,2,3,45,55,56} ;
        boolean inarray = false ;

        for(int i=0; i<arr.length ; i++){

            if(arr[i]==num){
                inarray = true ;
                break ;
            }

        }
        if(inarray){
            System.out.println("Present in array.") ;
        }
        else{
            System.out.println("Not present in array") ;
        }
    }
    
}
