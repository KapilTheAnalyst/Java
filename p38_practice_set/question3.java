// package p38_practice_set;

class Cylinder{
    private int radius ;
    private int height ;
    public Cylinder(int radius , int height){
        this.radius = radius ;
        this.height = height ;

    }

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

public class question3 {
    public static void main(String [] args){

        // 3. Use a constructor and repeat 1

        Cylinder obj = new Cylinder(9, 12) ;
        // obj.setRadius(9);
        // obj.setHeight(12) ;
        System.out.println("Radius of cylinder be: "+obj.getRadius()) ;
        System.out.println("Height of cylinder be: "+ obj.getHeight()) ;




    }
    
}
