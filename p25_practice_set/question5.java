// package p25_practice_set;

public class question5 {
    public static void main(String [] args){
        // Write a java program to reverse a array 

        int [] arr = {1,2,3,4,5,6} ;
         System.out.println("Before Array be ");

        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ") ;
        }

        for(int i =0 ; i<arr.length/2  ; i++){
            int temp = arr[i] ;
            arr[i] = arr[arr.length-1-i] ;
            arr[arr.length-1-i] = temp ;
        }
        System.out.println() ;
        System.out.println("Array be ");

        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ") ;
        }

    }
    
}
