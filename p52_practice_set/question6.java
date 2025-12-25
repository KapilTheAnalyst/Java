// package p52_practice_set;

interface TVRemote{
    void remote() ;
}
interface SmartTVremote extends TVRemote{
    void advancedRemote() ;
}
class TV implements TVRemote{
    public void remote(){
        System.out.println("TV remote") ;
    }
}

public class question6 {
    public static void main(String [] args){
        // 6. Create an interface TVRemote and use it to inherit 
        // another interface SmartTVRemote

        TV obj = new TV() ;
        obj.remote();


    }
    
}
