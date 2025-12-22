public class question1 {
    public static void main(String [] args){
        // Create an array of 5 floats and calculate their sum

        float[] arr = {12f , 13f , 34f , 56f , 596f} ;

        float sum = 0;
        for(int i=0; i<arr.length ;i++){
            sum = sum + arr[i] ;
        }
        System.out.println("Sum of all the elements of array be: " + sum);

    }
    
}
