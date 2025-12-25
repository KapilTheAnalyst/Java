// package p51_polymorphism;
interface MyCamera2{
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
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network) ;

}
class MyCellPhone2{
    void callNumber(double phoneNumber){
        System.out.println("Calling "+ phoneNumber) ;
    }
    void pickCall(){
        System.out.println("Connecting..") ;
    }
    

}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
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
    public void sampleMeth(){
        System.out.println("meth") ;
    }




}

public class polymorphism {
    public static void main(String [] args){

        // Polymorphism
        // Polymorphism means many forms
        // 
        MyCamera2 cam1 = new MySmartPhone2() ; // Dynamic method dispatch
        // cam1.getNetworks() ; // not allowed
        // cam1.sampleMeth() ; // not allowed
        cam1.record4KVideo();

        MySmartPhone2 obj = new MySmartPhone2() ;
        obj.sampleMeth() ;

        obj.callNumber(812621 ) ;
        
        

    }
    
}
