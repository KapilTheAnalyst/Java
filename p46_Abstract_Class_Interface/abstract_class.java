// package p46_Abstract_Class_Interface;
abstract class Parent2{
    public Parent2(){
        System.out.println(" Mai Parent2 ka constructor hoon") ;
    }
    public void sayHello(){
        System.out.println("Hello") ;

    }
    abstract public void greet() ;
    abstract public void greet2() ;

}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning.") ;
    }

    public void greet2(){
        System.out.println("Good Afternoon") ;
    }


}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good") ;
    }
}

public class abstract_class {
    public static void main(String [] args){

        // Abstract  
        // abstract means thngs existing in imagination not is real world
        // Abstract method
        // A method does not perform a specific task know to be abstract method
        // abstract void moveTo(doublex , double y)
        // Abstract class
        // A java class contain a abstract method known to be abstract class
        // We cannot create a object of abstract class

        Child2 pbj = new Child2() ;
        Parent2 p = new Child2() ;




    }
    
}
