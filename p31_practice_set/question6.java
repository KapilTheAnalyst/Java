// package p31_practice_set;

public class question6 {

    public static float average(int ...arr){
        int sum = 0; 

        for(int i=0;i<arr.length ;i++){
            sum = sum + arr[i] ;
        }
        return sum*1.0f/arr.length ;


    }
    public static void main(String [] args){
        // Write a function to find average of a 
        // set of numbers passed as arguements
        System.out.println(average(1,2)) ;
        System.out.println(average(1,2,3,4)) ;




    }
    
}
