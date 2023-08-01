public class Exam {

    public static void main(String[] args) {



        int p[][] = {{10,20,30},{20,30,40},{50,60,70}} ;

        int q[][] = {{10,20,30},{20,30,40},{50,60,70}} ;


        System.out.println("matrix p is -> ") ;

        for (int i = 0 ; i < p.length; i++){

            for (int j = 0 ; j < p[0].length; j++) {

                System.out.print(p[i][j]+" ") ;
            }
            System.out.println( );
        }


        System.out.println("matrix q is -> ") ;

        for (int i = 0 ; i < q.length; i++){

            for (int j = 0 ; j < q[0].length; j++) {

                System.out.print(q[i][j]+" ") ;
            }
            System.out.println( ) ;
        }

        int R[][] = new int[p.length][q[0].length] ;

        if(p.length != q.length || p[0].length != q[0].length) {

            System.out.println("size of matrix is different") ;

            return ;

        }


        System.out.println(" addition of matrix :- R = P + Q  ") ;

        for (int i = 0 ; i < R.length; i++){

            for (int j = 0 ; j < R[0].length; j++) {

                  R[i][j] =  p[i][j] + q[i][j] ;
            }

        }


        System.out.println("matrix R is -> ") ;

        for (int i = 0 ; i < R.length; i++) {

            for (int j = 0 ; j < R[0].length; j++) {

                System.out.print(R[i][j]+" ") ;
            }
            System.out.println( );
        }














    }
}
