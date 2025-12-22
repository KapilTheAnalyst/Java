// package p25_practice_set;

public class question3 {
    public static void main(String [] args){

        int[] marks = {56,67,89,90} ;
        float sum = 0; 

        for(int element:marks){
            System.out.println(element) ;
            sum = sum + element ;
        }
        System.out.println("Average of all the element of array be:" + sum/marks.length);

    }
    
}
