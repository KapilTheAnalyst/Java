
class A{
    public int a ;
    public int harry(){
        return 4 ;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A.");
    }

}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B.");
    }

    public void meth3(){
        System.out.println("I am a method 3 of class B");
    }

}
public class overriding {

    public static void main(String [] args){
        //Method overriding means changing a functionality of a same method name
        // redifining the method of super class
        A a = new A() ;
        B b = new B() ;

        a.meth2();
        b.meth2() ;

    }
    
}
