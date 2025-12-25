package p62_thread_life_cycle;

public class thread {
    public static void main(String [] args){

        // Life Cycle of Thread

        // 1. New
        //  A instance of thread is created but thread is not start
        // example
        // MyThread obj = new MyThread() ; // created object of class that implements Runnable interface
        // Thread t1 = new Thread(obj) ;// created object of Thread with Runnable 



        // 2. Runnable
        //  Thread is start to run
        // example
        // t1.start() ; // invoke a thread , Runnable state





        // 3. Running
        // when thread scheduler select a thread , it is in running state

        // 3.1 Non Runnable 
        // the thread is invoke  -> t1.start() 
        // but it is not selected by thread scheduler
        



        // 4. Terminated
        // thread is terminated , CPU or thread scheduler execute all thread or code. 
        //  run() method is exited


        // We can set a priority of a thread 


    }
    
}
