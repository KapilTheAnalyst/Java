// package p66_practice_set;

class MyThread1 extends Thread{
    @Override
    public void run(){
        
        int i=0 ;
        while(i<5678){
            System.out.println("Good Morning") ;
            i++ ;
        }
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

public class question_3 {
    public static void main(String [] args){

        // Demonstrate getPriority() and setPriority() methods
        // in java Threads

        MyThread1 t1 = new MyThread1() ;
        MyThread2 t2 = new MyThread2() ;

        t1.setPriority(Thread.MAX_PRIORITY) ;
        // t2.setPriority(Thread.NORM_PRIORITY) ;
        t2.setPriority(6) ;

        System.out.println("Priority od t1 Thread be: "+t1.getPriority()) ;
        System.out.println("Priority od t2 Thread be: "+t2.getPriority()) ;


    }
    
}
