package calc ;

class Calculator{
    public void calculate(int a , int b){
        System.out.println("Your result is " + a+b) ;
    }
}
class ScCalculator{
    public void calculate(int a , int b){
        System.out.println("Sign of a+b is  " + Math.sin(a+b)) ;

    }
}
class HyCalculator{
    public void calculate(int a , int b){
        System.out.println("Sign of a+b is  " + Math.sin(a+b)) ;
    }
}


public class question_1 {
    public static void main(String [] args){
        // create three classes Calculator , ScCalculator and HybridCalculator and group
        // them into a package .
        System.out.println("I am main method") ;

    }
    
}
