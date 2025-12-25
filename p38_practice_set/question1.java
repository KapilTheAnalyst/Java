// package p38_practice_set;

class Cylinder{
    private int radius ;
    private int height ;
    // public Cylinder(int radius , int height){
    //     this.radius = radius ;
    //     this.height = height ;

    // }

    public void setRadius(int r){
        this.radius = r ;
    }
    public void setHeight(int h){
        this.height  = h  ;
    }
    public int getRadius(){
        return radius ;
    }
    public int getHeight(){
        return height ;
    }
}

public class question1 {
    public static void main(String [] args){

        // 1. Create a class cylinder and use getters and setters 
        // to set its radius and height

        Cylinder obj = new Cylinder() ;
        obj.setRadius(9);
        obj.setHeight(12) ;
        System.out.println(obj.getRadius()) ;
        System.out.println(obj.getHeight()) ;



    }
    
}
