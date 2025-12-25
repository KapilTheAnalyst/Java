// package p63_thread_constructors;



class MyThr  extends Thread{
    public MyThr(String name){
        super(name) ;
    }
    
   public void run(){
    System.out.println("I am a run method() in thread") ;
   }
}

public class thread {
    public static void main(String [] args){

        MyThr t = new MyThr("Harry") ;
        t.start() ;

        MyThr t2 = new MyThr("Kapil") ;
        t2.start() ;

        // Thread methods
        //.getId() ;
        // .getName() ;
        System.out.println("Id be: "+t.getId()) ;
        System.out.println("Name of thread be: "+ t.getName()) ;

        System.out.println("Id of thread be: "+t2.getId()) ;
        System.out.println("Name of thread be: "+ t2.getName()) ;

    }
    
}
