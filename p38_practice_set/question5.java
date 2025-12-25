// package p38_practice_set;

class Sphere{
    private int radius ;
    

    public Sphere(){
        this.radius= 1 ;
        

    }
    public Sphere(int radius){
        this.radius = radius ;
    }
    

    public int getSide(){
        return radius ;
    }
    public double getArea(){
        return  4*Math.PI*radius*radius ;
    }
    public  double getVolume(){
        return 4*Math.PI*radius*radius*radius/3;
    }
}



public class question5 {
    public static void main(String [] args){

        Sphere obj = new Sphere(8) ;
        System.out.println("Area of sphere be: "+ obj.getArea()) ;
        System.out.println("Volume of sphere be: "+ obj.getVolume()) ;

    }
    

}
