// package p52_practice_set;
abstract class Pen{
    abstract void write() ;
    abstract void refill() ;

}
class FountainPen  extends Pen{

    void write(){
        System.out.println("Writting by a pen") ;
    }
    void refill(){
        System.out.println("Refilling a pen ") ;
    } 
    void changeNib(){
        System.out.println("Change a nib of a pen");
    }
}

public class question_1 {
    public static void main(String [] args){
        
        //create an absttract class Pen with methods 
        // write() and refill as abstract methods
        FountainPen obj = new FountainPen();
        obj.write();
        obj.refill() ;
        obj.changeNib() ;


    }
    
}
