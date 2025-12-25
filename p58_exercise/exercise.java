// package p58_exercise;
package com.codewithharry.shape;

class Square{
    int side ;
    public Square(int s){
        this.side = s ;

    }
    public void setSquareSide(int side){
        this.side = side ;
    }
    public int getSquareSide(){
        return this.side ;
    }
    public int getSquareArea(){
        return this.side*this.side ;

    }

}
class Circle extends Square{
    int radius ;
    public Circle(int radius){
        super(radius) ;
        this.radius = radius  ;
    }
    public void setCircleRadius(int radius){
        this.radius = radius ;
    }
    public int getCircleRadius(){      
        return this.radius ;
    }

    public double getCircleArea(){
        return Math.PI*this.radius*this.radius ;
    }
}
class Sphere extends Circle{
    int radius ;
    public Sphere(int radius){
        super(radius) ;
        this.radius=radius ;
    }
    public void setSphereRadius(int radius){
        this.radius = radius ;
    }
    public int getSphereRadius(){
        return this.radius ;
    }

    public double getSphereArea(){
        return 4*Math.PI*radius*radius ;
    }

    public double getSphereVolume(){
        return 4*Math.PI*radius*radius*radius/3 ;
    }

}
class Rectangle extends Sphere{
    int length ;
    int breadth ;
    public Rectangle(int length , int breadth){
        super(length) ; 
        this.length = length ;
        this.breadth = breadth ;
    }
    public void setRectangleLength(int length){
        this.length = length ;

    }
    public void setRectangleBreadth(int breadth){
        this.breadth = breadth ;
    }
    public int getRectangleLength(){
        return this.length ;
    }
    public int getRectangleBreadth(){
        return this.breadth ;
    }

    public int getRectangleArea(){
        return this.length*this.breadth ;
    }


}
class Cylinder extends Rectangle{
    int radius ;
    int height ;
    public Cylinder(int radius , int height){
        super(radius, height) ;
        this.radius = radius ;
        this.height = height ;
    }
    public void setCylinderRadius(int radius){
        this.radius =- radius ;
    }
    public void setCylinderHeight(int height){
        this.height = height ;
    }
    public int getCylinderRadius(){
        return this.radius ;
    }
    public int getCylinderHeight(){
        return this.height ;
    }


    public double getCylinderArea(){
        return  2*Math.PI*this.radius*(this.radius + this.height) ;
    }
    public double getCylinderVolume(){
        return Math.PI*this.radius*this.radius*this.height ;

    }

}


public class exercise {
    public static void main(String [] args){
        /*
        You have to create a package com.codewithharry.shape
        This package should have individual classes for rectangle , Square , Circle , Cylinder, Sphere
        These classes should use inheritance to properly manage the code!
        Included methods like volume , surface area and getters and setter for dimensions


         */

        Cylinder obj = new Cylinder(2, 3) ;
        System.out.println(obj.getCylinderArea()) ;
        System.out.println(obj.getRectangleArea()) ;

        


        }
    
}
