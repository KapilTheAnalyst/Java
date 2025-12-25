// package p39_inheritance;

class Base{
    public int x;
    public void setX(int x){
        this.x = x ;

    }
    public int getX(){
        System.out.println("I am setting X now.") ;
        return x ;
    }
    public void printMe(){
        System.out.println("I am a constructor") ;
    }
}
class Derived extends Base{
    public int y ;

    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y ;
    }

}

public class inheritance {
    public static void main(String [] args){

        // Inheritance
        // Inheritance is a process of inheriting properties of parent class 
        // by a child class
        // Inheritance provide code reusability

        Base b = new Base() ;
        b.setX(4);
        System.out.println(b.getX()) ;
        // b.printMe() ;

        Derived d = new Derived() ;
        d.setY(43) ; 
        System.out.println(d.getY()) ;
        


    }
    
}
