// package p36_constructors;
class MyMainEmployee{
    private int id ;
    private String name ;

    public MyMainEmployee(){
        id = 0 ;
        name = "Your-Name-Here" ;
    }

    public MyMainEmployee(String myName, int id){
        this.id = id;
        this.name = myName ;
    }
    public MyMainEmployee(String myName){
        id = 1 ;
        this.name = myName ;
    }

    public void setName(String name){
        this.name = name ;
    }
    public String getName(){
        return name ;
    }
    public void setId(int id){
        this.id = id ;
    }
    public int getId(){
        return id ;
    }

}

public class constructors {
    public static void main(String [] args){



        // MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12) ;
        MyMainEmployee harry = new MyMainEmployee() ;

        // harry.setName("CodeWithHarry") ;
        // harry.setId(34) ;

        System.out.println(harry.getId()) ;
        System.out.println(harry.getName()) ;
        

        // Constructors
        // A constructor is a method of name same as class name , contructor
        //  automatically invoke while creating an object of class.
        


    }
    
}
