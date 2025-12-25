// package p41_this_super_keyword;

class EkClass{
    int a  ;
    public EkClass(int a){

        // this keyword
        // this is a reference keyword 
        // this keyword is used to distinguish instance and local variables .
        this.a = a ;

    }

    public void setA(int a){
        this.a = a ;

    }
    public int getA(){
        return a ;
    }
    public int returnone(){
        return 1 ;
    }
}
class DoClass extends EkClass{
        
        public DoClass(int c){
            super(c) ;  
            System.out.println("I am a constructor hoon") ;

        }
    }

public class this_super {
    public static void main(String [] args){
        EkClass e = new EkClass(65) ;
        

        DoClass d = new DoClass(5) ;
        System.out.println(e.getA()) ;

        // super 
        // super is a reference keyword or variable
        // super is a reference variable used to refer immediate parent class.


    }
    
}
