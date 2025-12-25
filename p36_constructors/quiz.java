// package p36_constructors;

class Employee{
    private int salary ;
    public Employee(){
        salary = 10000 ;

    }
    public Employee(int n){
        this.salary = n ;
    }
    public int getSalary(){
        return salary ;
    }
}

public class quiz {

    public static void main(String [] args){
        // Overload the Employee constructor to initialize
        // the salary to Rs 10,000
        Employee  e = new Employee() ;
        Employee e1 = new Employee(12000) ;
        System.out.println(e.getSalary()) ;
        System.out.println(e1.getSalary()) ;


    }
    
}
