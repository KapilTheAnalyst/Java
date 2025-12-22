// package p33_custom_class;

class Employee{
    int id ;
    String name ;
    int salary ;

    public int getSalary(){
        return salary ;
    }


    public void printDetails(){
        System.out.print("My id is "+ id) ;
        System.out.println(" and my name is "+ name) ;

    }

}

public class custom {
    public static void main(String [] args){
        Employee harry = new Employee() ;
        Employee john = new Employee() ;

        // setting attributes for harry
        harry.id = 12 ;
        harry.name = "CodeWithHarry" ;
        harry.salary = 30000 ;

        // Setting attributes for john
        john.id = 13 ;
        john.name = "John Tripathi" ;
        john.salary = 12000 ;


        // getting attributes
        // System.out.println(harry.id) ;
        // System.out.println(harry.name) ;
        harry.printDetails() ;
        john.printDetails() ;

        int salary = john.getSalary() ;
        System.out.println(salary) ;



    }
    
}
