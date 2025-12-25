
import codewithharry.gym.HarryGym ;
class Using {
    void meth2(){

    // System.out.println(x);
    // System.out.println(y);
    // System.out.println(z);
    // System.out.println(a);
    }

}
public class UsingPackage {
    public static void main(String [] args){
        // System.out.println("I am using the packages.") ;
        HarryGym c1 = new HarryGym() ;
        Using c = new Using() ;
        c.meth2() ;

        System.out.println(c1.x);
        // System.out.println(c.y);
        // System.out.println(c.z);
        // System.out.println(c.a);
        


    }
    
}
