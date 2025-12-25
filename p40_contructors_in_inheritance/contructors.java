// package p40_contructors_in_inheritance;

class Base1{
    public int x ;

    public Base1(){
        System.out.println("I am a base class constructor") ;
    }
    public Base1(int x){
        System.out.println("I am overloaded base class constructor with value of x as: "+ x) ;
    }

    public void setX(int x){
        this.x = x ;
    }
    public int getX(){
        return x ;
    }
}
class Derived1 extends Base1{

    public Derived1(){
        // super(12) ;
        System.out.println("I am a derived class constructor") ;
    }
    public Derived1(int x , int y){
        super(x) ;
        System.out.println("I am a  overloaded constructor of derived with value of y as: "+ y) ;
    }
    public int y ;

    public void setY(int y){
        this.y = y ;
    }
    public int getY(){
        return y ;
    }
} 
class ChildOfDerived extends Derived1{
    public ChildOfDerived(){
        System.out.println("I am a child of a derived1 constructor") ;
    }
    public ChildOfDerived(int x, int y, int z){
        super(x,y) ;
        System.out.println("I am c child of derived class with value of z as: "+ z) ;


    }

}

public class contructors {
    public static void main(String [] args){

        // Base1 b = new Base1();

        // Derived1 d = new Derived1(14,9) ;
        ChildOfDerived cd = new ChildOfDerived(12, 13 , 15) ;



    }
    
}
