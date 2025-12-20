// package p9_associativity_precedence;

public class associativity_precedence {
    public static void main(String [] args){
        //int a = 60/5 - 5*1 ;
        /*
        60/5 - 5*1 
        / * have same precedence
        / * have associativity from left to right 
        so we execute expression from left to right

        12 - 5*1

        12 - 5

        7
        
        
        */
       //System.out.println(a);
       int b=  1;
       int c =  4 ;
       int a = 5 ;

       

       int k = b*b -4*a*c/(2*a );
       System.out.println(k) ;
    }
    
}
