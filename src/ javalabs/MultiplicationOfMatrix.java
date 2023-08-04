public class MultiplicationOfMatrix {
    public static void main(String[] args) {
        
        int matrixA[][] = {{1,2,3},{4,5,6},{7,8,9}} ;
        int matrixB[][] = {{11,4},{10,20},{3,5} } ;

                System.out.println("print matrixA") ;

        
        for(int i = 0 ; i < matrixA.length ; i++) {

            for(int j = 0 ; j < matrixA[i].length ; j++) {

                System.out.print(matrixA[i][j]+"\t") ;
            }
            System.out.println() ;
        }

        System.out.println("print matrixB") ;

        for(int i = 0 ; i < matrixB.length ; i++) {

            for(int j = 0 ; j < matrixB[i].length ; j++) {

                System.out.print(matrixB[i][j]+"\t") ;
            }
            System.out.println() ;
        }

        int rowsA = matrixA.length ;
        int colsB = matrixB[0].length ;
        int colsA = matrixA[0].length ;

        int matrixC[][] = new int[rowsA][colsB] ;

        System.out.println("multiplication result of  two matrix") ;

        for(int i = 0 ; i < rowsA ; i++ ) {

               for(int j = 0 ; j < colsB ; j++ ) {

                   for(int k = 0 ; k < colsA ; k++ ) {

                     matrixC[i][j] =    matrixC[i][j] + matrixA[i][k] * matrixB[k][j] ;
               }

        }
        
    }

    for(int i = 0 ; i < matrixC.length ; i++) {

            for(int j = 0 ; j < matrixC[i].length ; j++) {

                System.out.print(matrixC[i][j]+"\t") ;
            }
            System.out.println() ;
        }

    
}
    
}
