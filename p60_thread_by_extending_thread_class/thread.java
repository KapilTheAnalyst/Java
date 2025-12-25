// package p60_thread_by_extending_thread_class;

class MyThread extends Thread{

    @Override
    public void run(){

        int i = 0; 
        while(i<40000){
            System.out.println("MyThread is cooking");

        }

    }
}
class MyThread2 extends Thread{

    @Override
    public void run(){
        int a = 0;

        while(a<4000){
        System.out.println("MyThread2 is playing") ;
        }

    }
}

public class thread {
    public static void main(String [] args){

        MyThread t1 = new MyThread() ;
        MyThread2 t2 = new MyThread2() ;
        t1.start() ;
        t2.start() ; 


    }
    
}
