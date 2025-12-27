// package p75_finally_block;

public class finally_block {

    public static int greet(){

        try{
            int a = 50 ;
            int b = 0;
            int c = a/b ;
            return c ;

        }
        catch(Exception e){
            System.out.println(e) ;
        }
        // System.out.println("end") ;
        finally{
        System.out.println(" cleaning up resources ..This is a end of function.") ;
        }
        return 0 ;

    }
    public static void main(String [] args){

        // finally block
        // A code written inside a finally block always execute
        // irrespective of exception handled or not

        int k = greet() ;
        System.out.println(k) ;

        for (int i=0; i<5 ; i++){
            try{
                break ;
            }
            catch(Exception e){
                System.out.println("Exception") ;
            }
            finally{
                System.out.println("Always execute") ;
            }
            System.out.println("End for loop") ;
        }
    System.out.println(50*1.0/3) ;
        

    }
    
}
