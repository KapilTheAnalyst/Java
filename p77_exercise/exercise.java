// package p77_exercise;


import java.util.Scanner ;

class MaxInputException extends Exception{
    
    public MaxInputException(String str){
        super(str) ;
    }
}
class InvalidInputException extends Exception{
    public InvalidInputException(String str){
        super(str) ;
    }
}

class DivideByZeroException extends Exception{
     
    public DivideByZeroException(String str){
        super(str) ;
        
    }

}
class MaxMultiplierReachedException extends Exception{
    public MaxMultiplierReachedException(String str){
        super(str) ;
    }
}


public class exercise {
    

    public static int add(int num1 , int num2){
        return num1+num2 ;
    }
    public static int sub(int num1 , int num2){
        return num1-num2 ;
    }
    public static int mult(int num1 , int num2) throws MaxMultiplierReachedException{

        if(num1 >70000 || num2>70000){
            throw new MaxMultiplierReachedException("Reached multiplication limit") ; 
        }
        return num1*num2 ;
    }
    public static int divide(int num1 , int num2) throws DivideByZeroException{
        if(num2==0){
            throw new DivideByZeroException("Can not divide by zero") ;
        }
        return num1/num2 ;
    }

 
    public static void main(String [] args){
        /*

        Exercise:
        You have to create a custom calculator with following operations:
        1. Addition
        2. Subtraction
        3. Mutiplication
        4. Division

        which throws the following exceptions
        1. Invalid input Exception
        2. cannot divide by zero Exception
        3. Max Input Exception if any of the input is greater than 100000
        4. Max Mutiplier reached exception , don't allow any mutiplication input greater than 7000



         */ 

        try{
            Scanner sc = new Scanner(System.in) ;
        System.out.println("Welcome to a Calculator.") ;
        System.out.println("Calculator have following operation:") ;
        System.out.println("1.Addition \n2.Subtraction\n3.Multiplication\n4.Division") ;
        System.out.println("Type for operation: ") ;

        if(!sc.hasNextInt()){
            throw new InvalidInputException("sc.NextInt() ran") ;
        }
        int operation = sc.nextInt() ;

        System.out.println("Enter first oprand: ") ;

        if(!sc.hasNextInt()){
            throw new InvalidInputException("Not a valid first operator") ;
        }
        int num1 = sc.nextInt() ;

          
        if(num1>100000){
            throw new MaxInputException("First operand limit exceed") ;
        }
        

        
        System.out.println("Enter second operand: ") ;
        if(!sc.hasNextInt()){
            
            throw new InvalidInputException("Invalid Second operand") ;

        }
        int num2 = sc.nextInt() ;

        if(num2>100000){
            throw new MaxInputException("Exceed Second operator limit") ;
        }

        int result =0  ;



        switch(operation){
            

            case 1 ->
                result = add(num1,num2) ;
               
            

            case 2 ->
                result = sub(num1, num2) ;
            
            case 3 ->
                result = mult(num1,num2) ;
            
            case 4 ->
                result = divide(num1,num2) ;

            default ->
            throw new InvalidInputException("invalid operation");
            
            
           
    }
    System.out.println("Result be: " + result) ;
     
        
 }

        catch(Exception e){
            System.out.println("Error: "+e.getMessage()) ;
        }
        
       

    }
    
}






