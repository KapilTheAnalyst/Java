interface Bicycle{
    public int a1 = 90 ;

}
class A implements Bicycle{
    // int a1 = 89 ;

}
public class mutiple_inheritance{
    public static void main(String [] args){

        // Java does not allowed multiple inheritance through class
        // Java allowed mutiple inheritance through interfaces
        // I java a class can implements mutiple interface and a class
         A a = new A();
         System.out.println(a.a1);


    }
}