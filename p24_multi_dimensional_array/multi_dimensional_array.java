// package p24_multi_dimensional_array;

public class multi_dimensional_array {
    public static void main(String [] args){
        // what is mutidimensional array ?
        // Array of an arrays is known to be mutidimensional array
        int [] marks ; // 1 dimensional array
        int [][] flats; // 2 dimensional array
        flats = new int [2][3] ;

        flats[0][0] =101 ;
        flats[0][1] =102 ;
        flats[0][2] =103 ;
        flats[1][0] =201 ;
        flats[1][1] =202 ;
        flats[1][2] =203 ;

        for(int i=0; i<flats.length ;i++){
            for(int j=0; j<flats[i].length ;j++){
                System.out.print(flats[i][j] + " ") ;


            }
           System.out.println() ;
        }





    }
    
}
