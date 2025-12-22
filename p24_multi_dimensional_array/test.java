public class test{
    public static void main(String [] args){

        int [] a = {1,2,3,4} ;

        System.out.println("Array be ");

        for(int i=0;i<a.length ; i++){
            System.out.print(a[i]+ " ") ;
        }
      

        System.out.println();
        for(int i = 0; i<a.length/2 ; i++){
            int temp = a[i] ;
            a[i] = a[a.length-1-i] ;
            a[a.length-1-i] = temp ;
        }



        System.out.println("After Array be ");

        for(int i=0;i<a.length ; i++){
            System.out.print(a[i]+ " ") ;
        }
    }
}