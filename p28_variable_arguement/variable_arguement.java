// package p28_variable_arguement;

public class variable_arguement {
    // static int sum(int a , int b){
    //     return a+b ;
    // }
    // static int sum(int a , int b , int c){
    //     return a+b+c ;
    // }
    // static int sum(int a , int b , int c, int d){
    //     return a+b+c+d ;
    // }
    static int sum(int x , int ...arr){ // variable arguement
        int res = x; 

        for(int element:arr){
            res = res+ element ;
        }
        return res ;


    }
    public static void main(String [] args){
        
        System.out.println("Welcome to variable arguement") ;
        System.out.println("Sum of nothing: " + sum(0)) ;
        System.out.println(" sum of 4 , 3 be: "+ sum(4,3));
        System.out.println(" sum of 4 , 3 and 5 be: "+ sum(4,3,5));
        System.out.println(" sum of 1, 2, 4 , 3 and 5 be: "+ sum(1,2,4,3,5));
    }
    
}
