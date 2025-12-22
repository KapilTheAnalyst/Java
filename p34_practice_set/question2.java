// package p34_practice_set;

class Cellphone{

    public String ring(){
        return "cellPhone is ringing" ;
        
    }
    public String vib(){
        return "cellPhone is vibrating" ;
    }
    public String callFriend(){
        return "Calling Friend" ;
    }
}

public class question2 {
    public static void main(String [] args){

        //Create a class cellphone with methods to print "ringing" , "vibrating" , etc.
        Cellphone c = new Cellphone() ;
        
        System.out.println(c.ring());
        System.out.println(c.vib()) ;
        System.out.println(c.callFriend()) ;



    }
    
}
