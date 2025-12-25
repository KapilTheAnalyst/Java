// package p35_access_modifier;

class MyEmployee{
    private int id ;
    private String name ;

    public void setName(String Name){
        name = Name ;
    }
    public String getName(){
        return name ;
    }
    public void setId(int ID){
        id = ID ;
    }
    public int getId(){
        return id ;
    }
}

public class access_modifier {
    public static void main(String [] args){

        // Access Modifier
        // Access Modifier are the specifier where a property/method is accessible
        // There are four types of access modifiers in java
        // 1. Private
        // 2. Default
        // 3. Protected
        // 4. Public

        MyEmployee harry = new MyEmployee() ;

        // harry.id = 45 ; throws error due to private access modifier
        // harry.name = "CodeWithHarry" ;  throws error due to private access modifier
        harry.setName("CodeWithHarry") ;
        System.out.println(harry.getName() ) ;
        harry.setId(3);
        System.out.println(harry.getId()) ;   

        
    }
    
}
