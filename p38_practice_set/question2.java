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

    public double Area(){
        return 2*Math.PI*radius*(radius+height) ;
    }
    public double Volume(){
        return Math.PI*radius*radius*height ;
    }
}


public class question2 {
    public static void main(String [] args){

        // 2. Use 1 to calculate surface area and volume of the cylinder

        Cylinder obj = new Cylinder() ;
        obj.setRadius(9);
        obj.setHeight(12) ;
        System.out.println(obj.getRadius()) ;
        System.out.println(obj.getHeight()) ;
        System.out.println(  "Area be: "+obj.Area()) ;
        System.out.println("Volume of cylinder be: "+obj.Volume()) ;




    }
    
}
