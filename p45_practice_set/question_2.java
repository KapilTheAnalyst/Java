
class Rectangle{

    int length ;
    int breadth ;

    public void setLength(int length){
        this.length = length ;

    }
    public int getLength(){
        return length ;
    }
    public void setBreadth(int breadth){
        this.breadth = breadth ;
    }
    public int getBreadth(){
        return breadth ;

    }
    public Rectangle(int length , int breadth){
        this.length = length ;
        this.breadth = breadth ; 
    }
    public int perimeterRectangle(){
        return 2*(length + breadth) ;
    }

    public int areaRectangle(){
        return length*breadth ;
    }

}
class Cuboid extends Rectangle{
    int height ;

    public void setHeught(int height){
        this.height = height ;
    }
    public int getHeight(){
        return height ;
    }
    public Cuboid(int length , int breadth , int height){
        super(length , breadth) ;
        this.height = height ;

    }

    public int volumeCuboid(){
        return length*breadth*height ;
    }
}

public class question_2 {
    public static void main(String [] args){
        // create a class Rectangle and use inheritance to create another class cuboid.
        // Try to keep it as close to real world scenerio as possible

    }
    
}
