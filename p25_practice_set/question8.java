// package p25_practice_set;

public class question8 {
    public static void main(String [] args){
        // Write a java program to find a array is sorted or not
        int [] arr = {1,2,3,4,6,0 } ;

        boolean isSorted =true ;
        
        for(int i=0;i<arr.length-1 ; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false ; 
                break ;
            }

        }

        if(isSorted){
            System.out.println("Sorted Array.");
        }
        else{
            System.out.println("Unsorted array") ;
        }

    }
    
}
