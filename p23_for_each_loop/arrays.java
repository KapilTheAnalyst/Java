// package p23_for_each_loop;

public class arrays {

    public static void main(String [] args){
        
    //     float [] marks = {98.9f, 45.8f, 34} ;
    //     String [] students = {"Harry" , "Rohan" , "Shubham" , "Lavesh"} ;
    
    // System.out.println(marks.length) ;
    // System.out.println(marks[0]) ;
    // System.out.println(students.length) ;
    // System.out.println(students[2]) ;
    int [] marks = {98 , 45 , 79 , 99 , 80} ;

    // How to find length length of an array
    // System.out.println(marks.length) ;

    // How to display an array
    // System.out.println("Array printing using naive method ") ;
    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);
    // System.out.println(marks[3]);
    // System.out.println(marks[4]);

    // System.out.println("Array printing using for loop") ;

    // for(int i =0; i<marks.length ; i++){
    //     System.out.println(marks[i]) ;
    // }

    // Quiz : Traverse a array in reverse order
    // for(int i=marks.length-1 ; i>=0 ; i--){
    //     System.out.println(marks[i]) ;

    // }

    // For each loop
    for(int element:marks){
        System.out.println(element) ;
    }

    
}

}
