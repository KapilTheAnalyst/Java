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
        int i=0;
        while(i<7890){
        System.out.println("Welcome") ;
        i++ ;
        }
    }
}



public class question_4 {
    public static void main(String [] args){
        // How do you get state of an given thread in Java ?

        MyThread1 t1 = new MyThread1() ;
        MyThread2 t2 = new MyThread2() ;

        System.out.println("State of Thread be: "+t1.getState()) ;
        t1.start() ;
        System.out.println("State of thread t1 "+ t1.getState()) ;
        System.out.println("State of thread t1 "+ t1.getState()) ;
        System.out.println("State of thread t1 "+ t1.getState()) ;
        System.out.println("State of thread t1 "+ t1.getState()) ;
        System.out.println("State of thread t1 "+ t1.getState()) ;
        System.out.println("State of thread t1 "+ t1.getState()) ;
        System.out.println("State of thread t1 "+ t1.getState()) ;
        System.out.println("State of thread t1 "+ t1.getState()) ;

    }
    
}
