// package p34_practice_set;
class TommyVecetti{

    public void hitting(){
        System.out.println("Hitting enemy");
    }
    public void running(){
        System.out.println("Running from enemy");
    }
    public void firing(){
        System.out.println("Firing enemy");
    }
}

public class question5 {
    public static void main(String [] args){
        //create a class TommyVecetti for Rockstar Games
        // capable of hitting (print hitting), running , firing , etc
        TommyVecetti v = new TommyVecetti();

        v.hitting() ;
        v.running();
        v.firing() ;




    }
    
}
