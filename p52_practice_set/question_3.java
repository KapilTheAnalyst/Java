// package p52_practice_set;
interface BasicAnimal{
    void eat() ;
    void sleep() ;
}

class Monkey{
    void jump(){
        System.out.println("Jump by a monkey");
    }
    void bite(){
        System.out.println("Bite by a monkey") ;
    }

}
class Human extends Monkey implements BasicAnimal{
    // @Override
    void speak(){
        System.out.println("Hello sir .. Hello Sir" ) ;
    }
    @Override
    public void eat(){
        System.out.println("Eating...") ;

    }
    @Override
    public void sleep(){
        System.out.println("Sleeping...") ;
    }
}

public class question_3 {
    public static void main(String [] args){

        // 3. Create a class Monkey with jump() and bite() methods.
        // Create a class Human which inherits this monkey class and implements BasicAnimal
        // interface with eat() and sleep methods.

        Monkey h = new Human() ;
        // h.speak() ;
        h.jump() ;
        h.bite() ;

        BasicAnimal lovish = new Human() ;

        // lovish.speak() ;
        lovish.eat() ;
        lovish.sleep() ;



    }
    
}
