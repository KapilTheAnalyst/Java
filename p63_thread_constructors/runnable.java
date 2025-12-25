
class MyThread implements Runnable{
    public MyThread(){

    }
    public void run(){
        System.out.println("I am run() method of thread implementing Runnable interface") ;
    }
}

public class runnable {
    public static void main(String [] args){
        MyThread obj = new MyThread() ;
        Thread t = new Thread(obj) ;
        Thread t1 = new Thread(obj, "Kapil") ;
        t.start() ;
        System.out.println("Id be: "+t.getId()) ;
        System.out.println("Name be: "+t.getName()) ;

        System.out.println("Id be: "+t1.getId()) ;
        System.out.println("Name be: "+t1.getName()) ;

    }
    
}
