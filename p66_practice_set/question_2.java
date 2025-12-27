// package p66_practice_set;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;

        while(i<3000){
            System.out.println("Good Morning") ;
            i++ ;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;

        while(i<6000){



            
             i++ ;

            try{

            Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e) ;
            }
            System.out.println("Welcome") ;
           

        }
    }
}


public class question_2 {

    public static void main(String [] args){

        // Add a sleep method in welcome thread of question  pf wuestion 1
        // to delay its execution for 200ms.

        MyThread1 t1 = new MyThread1() ;
        MyThread2 t2 = new MyThread2() ;

        t1.start() ;
        t2.start() ;



    }
    
}
