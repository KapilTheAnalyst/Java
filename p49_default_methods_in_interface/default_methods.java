// package p49_default_methods;
interface MyCamera{
    void takeSnap();
    void recordVideo() ;
    private void greet(){
        System.out.println("Good Morning");
    }

    default void record4KVideo(){
        greet() ;
        System.out.println("Recording in 4k") ;
    }


}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network) ;

}
class MyCellPhone {
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber) ;
    }
    void pickCall(){
        System.out.println("Connecting..") ;
    }
    

}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap") ;
    }
    public void recordVideo(){
        System.out.println("Recording video") ;

    }
    public String[] getNetworks(){
        System.out.println("Getting list of Networks.") ;

        String [] networkList = {"Harry", "Prashant" , "Anjali5G"} ;
        return networkList ;

    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network) ;

    }
    // public void record4KVideo(){
    //     System.out.println("Taking snap and recording in 4k") ;
    // }




}

public class default_methods {
    public static void main(String [] args){

        MySmartPhone ms = new MySmartPhone() ;
        ms.record4KVideo() ;
        String[] ar = ms.getNetworks() ;
        

        for(String item:ar){
            System.out.println(item + " ") ;
        }
        // ms.greet() ; // throws an error
        

    }
    
}
