// package p45_practice_set;

class Circle{

    public int radius;
    public Circle(int radius){
        this.radius = radius ;
        System.out.println("I am circle paramatrized constructor ") ;
    }
    public Circle(){
        System.out.println("I am a non paramiterized constructor of Circle") ;

    }
    public double area(){
        return Math.PI*this.radius*this.radius ;
    }

}
class Cylinder1 extends Circle{
    public int height = 6 ;
    public Cylinder1(int radius , int height){
        super(radius) ;
        this.height  = height ;
        System.out.println("I am cylinder1 parameterized constructor") ;

    }
    

    public double volume(){
        // return 2*Math.PI*radius*(radius + height) ;
        return Math.PI*radius*radius*this.height ;

    }
}


public class question_1 {
    public static void main(String [] args){
        // Create a class Circle and use inheritance to create
        // another class Cylinder from it

        // Circle objc = new Circle() ;

        Cylinder1 obj = new Cylinder1(12,4) ;
        System.out.println("Area of circle be: "+ obj.area() ) ;

    }
    
}
