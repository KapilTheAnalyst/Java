// package p34_practice_set;

class Employee{
    int salary ;
    String name ;

    public int getSalary(){
        return salary ;
    }

    public String getName(){
        return name ;
    }

    public void setName(String newName){
        name = newName ;

    }

}

public class question1 {
    public static void main(String [] args){
        // Create a class Employee with following properties and following methods
        // Salary (property) (int)
        // getSalary (method returning int)
        // name (property) (String)
        // getName (method returning String)
        // setName (method changing name)

        Employee e = new Employee() ;
        e.salary = 12000 ;
        e.name = "Kapil" ;
        System.out.println("Salary be: "+e.getSalary());
        System.out.println("Name be: "+e.getName());
        e.setName("harry") ;

        System.out.println("Salary be: "+e.getSalary());
        System.out.println("Name be: "+e.getName());



    }
    
}
