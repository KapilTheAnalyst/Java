// package p15_;


public class logical {
    public static void main(String [] args){


        // Logical operators
        // && and || are logical operators
        // && is logical AND
        // || is logical OR
        

        boolean a = true;
        boolean b = false ;
        boolean c = true;

        // Logical AND

        if(a && b && c){
            System.out.println("Yes");
        }
        else{
            System.out.println("No") ;
        }

        // Logical OR
        
        if(a || b){
            System.out.println("Yes, Yes");
        }
        else{
            System.out.println("No, no");
        }

        // Logical NOT
        System.out.println("For logical operator NOT");
        
        System.out.println(!a);

    }
    
}
