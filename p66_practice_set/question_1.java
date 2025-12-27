// package p66_practice_set;

class MyThread1 extends Thread{
    @Override
    public void run(){

        int i=0 ;
        while(i<3000){
            System.out.println("Good Morning.") ;
            i++ ;
        }

    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0 ;
        while(i<4000){
            System.out.println("Welcome") ;
            i++ ;
        }
    }
}

public class question_1 {
    public static void main(String [] args){
        // Write a program to print "good morning" and "Welcome"
        // continously on the screen in java using threads

        MyThread1 t1 = new MyThread1() ;
        MyThread2 t2 = new MyThread2() ;
        t1.start() ;
        t2.start() ;





    }
    
}
