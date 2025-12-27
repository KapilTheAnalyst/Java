// package p64_thread_priorities;

class MyThr1 extends Thread{
    // public MyThr1(){

    // }
    public MyThr1(String nae){
        super(nae) ;

    }
    public void run(){
        int i = 34 ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
        System.out.println("Thank You: "+ this.getName()) ;
    }
}



public class thread {
    public static void main(String [] args){

        // JVM create a READY Queue to run a thread
        // READY Queue T1 T2 T3 T4 T5

        // Thread Priority
        // Thread.MIN_PRIORITY = 1 
        // Thread.NORM_PRIORITY = 5 
        // Thread.MAX_PRIORITY = 10 

        MyThr1 t1 = new MyThr1("Harry1") ;
        MyThr1 t2 = new MyThr1("Harry2") ;
        MyThr1 t3 = new MyThr1("Harry3") ;
        MyThr1 t4 = new MyThr1("Harry4") ;
        MyThr1 t5 = new MyThr1("Harry5 (most Important)") ;
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY) ;
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY) ;
        t4.setPriority(Thread.MIN_PRIORITY) ;

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        


    }
    
}
