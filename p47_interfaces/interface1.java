// package p47_interfaces;
interface Bicycle{
    int a = 45 ;
    void applyBrake(int decreement)  ;
    void speedUp(int increement) ;

}
interface HornBicycle{
    void blowHornK3g() ;
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
     // a  = 90 ; // we cannot modify the properties of interface as they are final 
    void blowHorn(){
        System.out.println("pee pee...") ;
    }
    public void applyBrake(int decreement){
        System.out.println("Applying Brake ") ;

    }
    public void speedUp(int increement){
        System.out.println("Spedd a bicycle");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi Khushi kabhi gum pe pe pe pe ");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon na po po po po") ;
    }


}

public class interface1 {
    public static void main(String [] args){

        // interfaces
        // in english interface is a point where two systems are meet
        // In java a interfaces is a group of related methods with empty body 
        // in java a abstract can also have non abstract method
        // in java a interface only contain abstract method 
        // in java we can not create a object of interface 
        // in java we can create a reference of interface
        // in java interface inherit by concrete class by implements keyword
        // in java a class can implements more than one interfaces and a one class
        // so interface in java provide multiple inheritance
        
        AvonCycle cycleHarry = new AvonCycle() ;
        cycleHarry.applyBrake(3) ;
        // We can can create properties in interface
        System.out.println(cycleHarry.a) ; 

        // we cannot modify the properties of interface as they are final 
        // cycleHarry.a = 89 ;// we cannot modify a properties of interface as it is final
        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();



    }
    
}
