public class Lab226_233 {
    public static void main(String[] args) {
        /*for(int i = 0 ; i < 10 ; i++ ) {
            System.out.println(i) ;
            if(i==5) 
            continue ;
            System.out.println("After") ;
        }*/

        /*for(int i = 0 ; i < 10 ; i++ ) {
            System.out.println(i) ;
             
            continue ;
            System.out.println("After") ;
        } */

        for(int i = 1 ; i <= 5 ; i++ ) {
            System.out.println("\n"+i) ;
            for(int j = 1 ; j <= 5 ; j++ , System.out.println("j++") ) {


            if(i==3) 
            continue ;
            System.out.println("After "+j) ;
            }
        }


    }
    
}
