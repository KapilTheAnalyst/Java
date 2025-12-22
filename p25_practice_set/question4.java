// package p25_practice_set;

public class question4 {
    public static void main(String [] args){
        // Create a java program to add two matrices of size 2*3
        int[][] m1 = {{1,2,3},
                       {4,5,6}} ;

        int[][] m2 = {{3,2,1},
                       {4,1,2}} ;

        int[][] res = new int[2][3] ;

        for(int i=0; i<m1.length ;i++){
            for(int j=0;j<m1[i].length;j++){
                //System.out.print(m2[i][j] + " ");
                res[i][j] = m1[i][j] + m2[i][j] ;

            }
            System.out.println() ;
        }

        System.out.println("Addition of two matrix be: ");

        for(int i=0;i<res.length ; i++){
            for(int j=0;j<res[i].length ; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println() ;
        }


    }
    
}
