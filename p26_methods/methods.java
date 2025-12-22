// package p26_methods;

public class methods {
    public int logic(int x , int y){

        int z;

        if(x>y){
            z = x+y ;
        }
        else{
            z = (x+y)*5 ;
        }

        return z ;

    }

    public static void main(String [] args){
        // Method is a group of code that perform specific task 

        methods m = new methods();

        int a = 5;
        int b = 7 ;
        int c = m.logic(a,b) ;
        System.out.print(c);

        int a1 = 2;
        int b1 = 1 ;
        int c1 = m.logic(a1, b1) ;
        System.out.println() ;
        System.out.print(c1) ;

        int d = 5 ;
        System.out.println() ;
        System.out.println(d);

    }
    
}
