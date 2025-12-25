// package p52_practice_set;

abstract class TelePhone{
    abstract void ring() ;
    abstract void lift() ;
    abstract void disconnect() ;
    void hello() {
        System.out.println("Hello") ;
    }
}
class SmartPhone extends TelePhone{
    void hii(){
        System.out.println("Hii everyone") ;
    }
    void ring(){
        System.out.println("Ringing...") ;

      
    }
    void lift(){
        System.out.println("Lifting..");
    }
    void disconnect(){
        System.out.println("Lifting...") ;
    }
}

public class question_4 {
    public static void main(String [] args){

        TelePhone obj = new SmartPhone() ;
        obj.disconnect();
        obj.ring();
        

    }
    
}
