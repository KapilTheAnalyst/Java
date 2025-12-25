// package p43_dynamic_method_dispatch;

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am") ;
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone..") ;
    }
}

public class dynamic_method_dispatch {
    public static void main(String [] args){
        // Phone obj = new Phone() ; // Allowed
        // SmartPhone smobj = new SmartPhone() ; // Allowed
        // obj.name();

        // Phone obj = new SmartPhone() ; // Allowed
        // Phone obj is a reference which is of super class
        // new SmartPhone() is a object of child class

        // SmartPhone smobj = new Phone() ; // Not Allowed
        // Above line is not allowed 
        // Because SmartPhone is reference of child class
        // new Phone() is a object of parent or super class
        // we cannot assign reference of child class to object of parent class

        Phone obj = new SmartPhone() ;// Dynamic Method dispatch
        // Dynamic method dispatch is also called Runtime Polymorphism
        // Because object is created at runtime.
        obj.showTime() ;
        obj.on() ;
        // obj.music() ; // error




    }
    
}
