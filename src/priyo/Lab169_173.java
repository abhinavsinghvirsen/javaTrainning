package priyo;

import javax.lang.model.util.ElementScanner14;

public class Lab169_173 {
    
    public static void main(String[] args) {
        
      /*   int a = 0 ;

        if(a++ == 0)
        System.out.println("Zero") ; // Zero
       
        else if(a++ == 1) 
        System.out.println("one") ;

        else 
             System.out.println("nothing") ;

             System.out.println(a) ; // 1 */
    
             
             
             /*  int a = 0 ;

             if(++a == 0)
             System.out.println("Zero") ; // Zero
            
             else if( ++a == 1) 
             System.out.println("one") ;
     
             else 
                  System.out.println("nothing") ; // nothing
     
                  System.out.println(a) ; // 2    */
    
    

                 /* if(0)   //  Type mismatch: cannot convert from int to boolean
                 System.out.println("if block") ;
                 System.out.println("hello guys") ;     */
                 
                 /* int a = 10 ;
                 int b = 20 ;

                 if(a > b) {

                    System.out.println("max value between"+ a + "and" + b + "is" + a) ;

                 }else {
                    System.out.println("max value between "+ a + " and " + b + " is " + b) ;

                 } */

                 int a = 10 ;
                 int b = 20 ;
                 int c = 15 ;
                 int max = 0 ;

                 if(a>b && a>c)
                     max = a ;
                  else if(b>a && b>c)
                      max = b ;
                else 
                     max = c ; 
                     
                     System.out.println("Max value is " + max) ; // 20

            }

}
