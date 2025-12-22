// package p25_practice_set;

public class question7 {
    public static void main(String [] args){

        int[] arr = {23,12,23,1,34,21,67} ;

        int num = Integer.MIN_VALUE ;
        // System.out.println(num) ;

        for(int i=0; i<arr.length ; i++){
            if(arr[i] > num){
                num = arr[i] ;
            }
        }
        System.out.println("Largest element in an array be "  + num );
        }
    
}
