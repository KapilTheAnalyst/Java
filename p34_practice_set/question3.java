// package p34_practice_set;

class Square{
    float side ;

    public float area(){
        return side*side ;
    }
    public float perimeter(){
        return 4*side ;
    }
}

public class question3 {
    public static void main(String [] args){
        // 3. Create  a class square with a method to initialize its its side,
        // calculating area , perimeter etc

        Square s = new Square() ;
        s.side = 3 ;

        System.out.println("Area of square be: " + s.area()) ;
        System.out.println("Perimeter of square be: " + s.perimeter()) ;



    }
    
}
