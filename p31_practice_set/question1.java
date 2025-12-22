// package p31_practice_set;

public class question1 {

    static int table(int n , int i){
        if(i==10){
            return n*10 ;
        }
        return n*i ;
    }
    static void multiplication(int n){

        for(int i=1; i<10 ; i++){
            System.out.println( n+"X"+i+"="+ n*i) ;
        }
    }
    public static void main(String [] args){
        //1. Write a java program to print mutiplication table of a number n
        int num =  10;
        for(int i=1;i<=10 ;i++){
            System.out.println( num+"*"+i+"="  +table(num , i)) ;
        }
        multiplication(10) ;

    }
    
}
