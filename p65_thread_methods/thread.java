// package p65_thread_methods;

class MyNewThr1 extends Thread{
    public MyNewThr1(String name){
        super(name) ;
    }
    public void run(){
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
        System.out.println("I am a method run of a thread") ;
    }
}

class MyNewThr2 extends Thread{
    
    public void run(){
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        try{
        Thread.sleep(455) ;
        }
        catch(Exception e){
            System.out.println(e) ;
        }

        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
        System.out.println("I am a method run of a thread 2") ;
    }
}

public class thread {
    public static void main(String [] args){

        // thread methods


        // obj.join() ;
        // Thread.sleep() ;

        // Daemon Thread
        // Daemon Thread is background thread with a least Priority
        

        MyNewThr1 t1 = new MyNewThr1("harry") ;
        MyNewThr2 t2 = new MyNewThr2() ;
        t1.start() ;

        // try{
        //     t1.join() ;
            
        // }
        // catch(Exception e){
        //     System.out.println(e) ;

        // }
        
        t2.start() ;



    }
    
}
