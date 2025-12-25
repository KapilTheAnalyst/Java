// package p45_practice_set;

class Base{
    public Base(){
        System.out.println("I am base class constructor") ;
    }
}
class Derived1 extends Base{
    public Derived1(){
        System.out.println("I ma Derived1 class constructor.") ;
    }
}
class Derived2 extends Derived1{
    public Derived2(){
        System.out.println("I am Derived2 class constructor") ;
    }
}

public class question_3 {
    public static void main(String [] args){

        Derived2 obj = new Derived2() ;

    }
    
}
