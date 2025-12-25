// package p38_practice_set;

class Rectangle{
    private int length ;
    private int breadth ;

    public Rectangle(){
        this.length = 1 ;
        this.breadth = 2 ;

    }
    public Rectangle(int length){
        this.length = length ;
    }
    public Rectangle(int length , int breadth){
        this.length = length ;
        this.breadth = breadth ;

    }

    public int getLength(){
        return length ;
    }
    public int getBreadth(){
        return breadth ;
    }
}

public class question4 {
    public static void main(String [] args){

        Rectangle obj = new Rectangle(12,56) ;

        System.out.println("Length of Rectangle be: " + obj.getLength()) ;
        System.out.println("Breadth of Rectangle be: "+ obj.getBreadth()) ;

    }
    
}
