// package p34_practice_set;

class Rectangle{
    int length ;
    int breadth ;

    public int area(){
        return length*breadth ;

    }
    public int perimeter(){
        return 2*(length + breadth) ;
    }
}

public class question4 {
    public static void main(String [] args){
        // Create a class Rectangle initialize its sides
        // , craete a methods to get area and  perimeter of a rectangle
        Rectangle r = new Rectangle() ;

        r.length = 2 ;
        r.breadth = 3 ;

        System.out.println("Area of rectangle be: " + r.area()) ;
        System.out.println("Perimeter of Rectangle be: " + r.perimeter()) ;



    }
    
}
