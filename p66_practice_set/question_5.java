// package p66_practice_set;

class MyThread1 extends Thread{
    @Override
    public void run(){
        
        
            System.out.println("Good Morning") ;
            
        
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
       
      
        System.out.println("Welcome") ;
        
        
    }
}


public class question_5 {
    public static void main(String [] args){
        

        // How do you get reference to the current thread in Java ?

        MyThread1 t1 = new MyThread1() ;
        MyThread2 t2 = new MyThread2() ;
        System.out.println("Reference of current thread be: "+Thread.currentThread()) ;
        t1.start() ;
        t2.start() ;
        System.out.println("Reference of current thread be: "+Thread.currentThread()) ;

    }
    
}
