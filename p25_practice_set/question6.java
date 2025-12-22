// package p25_practice_set;

public class question6 {
    public static void main(String [] args){
        // Write a java program to find the minimum element of an array

        int [] arr = {21,23,12,34,2,34} ;
        int num = Integer.MAX_VALUE ;
        // System.out.println(num ) ;

        for(int i = 0 ; i< arr.length  ; i++){
            if(num>arr[i]){
                num = arr[i] ;
            }
        }
        System.out.println("Smallest element in an array be: " + num) ;

    }
    
}
