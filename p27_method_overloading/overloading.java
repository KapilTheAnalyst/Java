// package p27_method_overloading;

public class overloading {
    static void foo(){
        System.out.println("Good morning bro!") ;
    }
    static void foo(int a){ // Here a be the parameter
        System.out.println("Good morning "+ a+ " bro!") ;

    }
    static void foo(int a , int b){
        System.out.println("Good morning "+ a + " and bro "+ b ) ;
    }
    static void change(int a){
        a = 98 ;
    }
    static void change2(int [] arr){
        arr[0] = 98 ;
    }
    static void tell_joke(){
        System.out.println("I invented a new word\n"+ "plagiarism") ;
    }
    public static void main(String [] args){
        // tell_joke();
       


        // changing a integer
        // int x= 45 ;
        // change(x) ;
        // // System.out.println("The value of x after running change: "+x) ;
        //  int[] marks = {22,73,77,89,98,94} ;
        //  change2(marks) ;
        //  System.out.println("The value of first element of an array be: " +marks[0] ) ;

         // Method Overloading
         // Two methods having same name but having different parameters known to be 
         // method overloading .

         foo() ;
         foo(3000) ;
         foo(3000, 4000) ;// Here 3000, 4000 are arguements, arguements are actual.

         // Method overloading can not perform by changing a method return type .








    }
    
}
