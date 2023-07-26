public class AdditionOfMatrix {
    public static void main(String[] args) {
        
        int P[][] ={{1,2,3,},{4,5,6,},{7,8,9}} ;
        int Q[][] = {{11,22,33},{44,55,66},{77,88,99}} ;

        System.out.println("matrix P :- ") ;

        for(int i = 0 ; i < P.length ;i++) {

            for(int j = 0 ; j < P[0].length ;j++) {

            System.out.print(P[i][j]+" ") ; 

            }
            System.out.println() ;
        }

        System.out.println("matrix Q :- ") ;

        for(int i = 0 ; i < Q.length ;i++) {

            for(int j = 0 ; j < Q[0].length ;j++) {

            System.out.print(Q[i][j]+" ") ; 

            
        }
        System.out.println() ;
        
    }

    int  R[][] = new int[P.length][Q[0].length] ;

    if(P.length != Q.length || P[0].length != Q[0].length) {
        
        System.out.println("we cannot perform addition of matrix if dimensions are not equal") ;
        
        return ;
    }

    System.out.println("matrix of R is = P + Q ") ;

    for(int i = 0 ; i < R.length ; i++ ) {

        for(int j = 0 ; j < R[i].length ; j++) {

            R[i][j] = P[i][j] + Q[i][j] ;
        }
    }

    System.out.println("Addition of two matrix is :- ") ;

    for(int i = 0 ; i < R.length ; i++ ) {

        for(int j = 0 ; j < R[i].length ; j++) {

           System.out.print( R[i][j] + " " ) ;
        }
        System.out.println() ;
    }



 }


    
}
