package priyo;

public class Lab217_225 {
    
    public static void main(String[] args) {
        
        /* for(int i = 1 ; i <= 10 ; i++) {
            System.out.println(i) ;
            if(i == 5)
            break;
            System.out.println("INSIDE LOOP") ;

        }
        System.out.println("OUTSIDE LOOP");

        o/p :    
        1
        INSIDE LOOP
        2
        INSIDE LOOP
        3
        INSIDE LOOP
        4
        INSIDE LOOP
        5
        OUTSIDE LOOP */



        /* int i = 2 ;
        if(i == 2)
        break ;   break cannot be used outside of a loop or a switch */

       
        /* for(int i = 0 ; i < 10 ; i++) {
            System.out.println(i) ; 0
            break ;
           // System.out.println("inside loop") ; unrechable code
        } */


/*      for(int i = 1 ; i <= 5 ; i++) {
            System.out.println("\n"+i) ;
        for(int j =1 ; j <= 5 ; j++,System.out.println("j++:- "+ j)) {
            if(i == 3) 
            break ;
            System.out.println("jlc") ;
          }    
        }

        o/p :    
        
        1
        jlc
        j++:- 2
        jlc
        j++:- 3
        jlc
        j++:- 4
        jlc
        j++:- 5
        jlc
        j++:- 6
        
        2
        jlc
        j++:- 2
        jlc
        j++:- 3
        jlc
        j++:- 4
        jlc
        j++:- 5
        jlc
        j++:- 6
        
        3
        
        4
        jlc
        j++:- 2
        jlc
        j++:- 3
        jlc
        j++:- 4
        jlc
        j++:- 5
        jlc
        j++:- 6
        
        5
        jlc
        j++:- 2
        jlc
        j++:- 3
        jlc
        j++:- 4
        jlc
        j++:- 5
        jlc
        j++:- 6    */



/*         for(int i = 1; i <= 5 ; i++) {
            for(int j = 1 ; j <= 3 ; j++) {
                if(i == 3)
                break ;
                System.out.println(i+"\t"+j) ;
            }
            
        }   */


 /*      jlc:
        for(int i =1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= 3 ; j++ ){
                if(i == 3)
                break jlc ;
                System.out.println(i+"\t"+j) ;
            }
        }     */

         
     /*   csk:
        for(int i =1 ; i <= 5 ; i++) {
            System.out.println(i) ;
        }

        for(int j =1 ; j <= 3; j++) {
            System.out.println(j) ;
            break csk ;  The label csk is missing
        } */



/*        int ab = 10 ;

        jlc : {
            System.out.println("jlc block start") ;

            GT : {
                System.out.println("GT block is start") ;
                if(ab == 10)
                break jlc ;
                System.out.println("GT block end") ;
            }
            System.out.println("jlc block end") ;
        }
           System.out.println("complited") ;

           o/p :- 
           
           jlc block start
           GT block is start
           complited  */



 /*          int ab = 10 ;

        jlc : {
            System.out.println("jlc block start") ;

            GT : {
                System.out.println("GT block is start") ;
                if(ab == 10)
                break GT ;
                System.out.println("GT block end") ;
            }
            System.out.println("jlc block end") ;
        }
           System.out.println("complited") ;

           o/p : 
           
           jlc block start
           GT block is start
           jlc block end
           complited        */



        

    }
}
