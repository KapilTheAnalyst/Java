// package p13_practice_set;

// Write a java program to fill a letter template which looks like below:
// letter = "Dear <|name|>, Thanks a lot."
// Replace <|name|> with a string (some name )

public class question3 {
    public static void main(String [] args){
        String s = "Dear <|name|>, Thanks a lot" ;
        System.out.println("String be: " + s);
        System.out.println("String after replacement: " + s.replace("<|name|>" , "Kapil"))  ;

    }


    
}
