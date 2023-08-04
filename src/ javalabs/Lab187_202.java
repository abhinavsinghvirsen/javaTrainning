public class Lab187_202 {

    public static void main(String[] args) {
        
       /*   for(int i = 0 ; i <= 10 ; i++) {
            System.out.println(i) ;
        } */

        /* for(int i = 1 ; i <= 100 ; i++ ) {
            if(i%2==0) {
                System.out.println(i) ;
            }
        } */

       /*  for(int i=1 ; i <=10 ;i++) {
           int a = 99 ;
            a++;
            System.out.println(i+"\t"+a) ;
        } */

        
        /*  for(int i = 1 ; i <= 10 ; i++)
         System.out.println(i) ;
          
         //System.out.println(i) ; cannot find symbool */

       /*   int i = 1 ;
         for( ; i<=10 ; i++)
         System.out.println(i) ;
         System.out.println("After : "+i) ; */

       //  for(;;) deadloop / infinite loop

      /*  for(int i=1 , char ch='A'; i<=10;i++)
       System.out.println(i) ; identifier expected */

      /*  byte b = 127 ;
       b++ ;
       System.out.println(b) ;
       for(byte by = 10 ; by>0 ; by++){
        System.out.println(by) ;
       } */

    /* int val = 2147483640 ;
       for( ; val > 200 ; val++ ){
        System.out.println(val) ;
       }
       System.out.println("After loop: " +val); */

      /*  for(int rows = 0 ; rows <= 5 ; rows++) {
           
            for(int cols = 0 ; cols <= rows ; cols++) {
                System.out.print("A"+" ") ;
            }
             System.out.println() ;
       } */

      /*  int a ;
       char ch ;
       float f ;
       String str ;
       for(a = 5 , ch = 'A' , f = 123456.76f , str = "" ; a>=0 ;a--,ch++,f/=10,str+=ch){
        System.out.println(a+"\t"+ch+"\t"+f+"\t"+str);
       }
       o/p:
       5       A       123456.76
       4       B       12345.676       B
       3       C       1234.5676       BC
       2       D       123.456764      BCD
       1       E       12.345676       BCDE
       0       F       1.2345676       BCDEF  */


     /*   int i =1 ;
       for(System.out.println("start"),System.out.println("begin"); i<=5 ; i++ ,System.out.println("Updating"),System.out.println("updating")) {
          System.out.println(i) ;
       }

 o/p:
start
begin
1
Updating
updating
2
Updating
updating
3
Updating
updating
4
Updating
updating
5
Updating
updating */


         /*  for(int i = 0 , System.out.println("Begin"); i<5 ; i ++ , System.out.println("Update")) {
            System.out.println(i) ; error 
          }  */
        
          
         /*  boolean b1 = true ;
          for(;b1;)
          System.out.println("java") ;
          System.out.println("After") ; */

          /* final boolean b1 = true ;
          for(;b1;)
          System.out.println("java") ;
          System.out.println("After") ; Unreachable code */


          /* for(int i = 0 ; i <10 ; i++){
            System.out.println(i);
            break;
             System.out.println("inside loop"); 
          } */
          


    }

}
