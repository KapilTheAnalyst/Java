// package p74_throw_and_throws;

class NegativeRadiusException extends Exception{
                           
    @Override
    public String toString(){
        return "Radius cannot be negative" ;

    }
    @Override
    public String getMessage(){
        return "radius cannot be negative" ;

    }
}
public class throw_throws {
    public static int divide(int a , int b) throws ArithmeticException{

            int result = a/b ;
            return result ;

        }
        public static double area(int r) throws NegativeRadiusException {

            if(r<0){

                throw new NegativeRadiusException() ; 
            }
            double result = Math.PI*r*r ;

            return result ;

        }
    public static void main(String [] args){


        // throw keyword is used to throw custom exception
        // throws keyword is used to declare or to give sign a method 
        // can throw a exception , so handle it.
        try{

        int c = divide(6,0) ;
        System.out.println(c) ;

        }
        catch(Exception e){
            System.out.println("Exception") ;
        }

        

            
        try{
        double ar = area(6) ;
        System.out.println("Area be: " ) ;
        }
        catch(Exception e){
            System.out.println(e) ;
        }

        

    }
    
}
