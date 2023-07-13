package priyo;

public class Lab270_273 {
    public static void main(String[] args) {
        
        /*int arr[] = {11,22,33,44,55} ;
        for(int i : arr)
          System.out.println(i) ;*/


       /*  String names[] = {"sir","Ravindra","jadeja"} ;
         for(String s : names)
         System.out.print(s+" ") ; */
         
         
       /*int arr[] = null ;
       for(int i : arr) 
       System.out.println(i) ;   null pointer exception */


       /* char ch[] = {'A','R','P','I','T','A'} ;
       for(char ch1 : ch)
       System.out.print(ch1) ; */


       if(args.length >= 2){
        String str1 = args[0] ;
        String str2 = args[1] ;
        System.out.println(str1 + str2) ;
        int a = Integer.parseInt(str1) ;
        int b = Integer.parseInt(str2) ;
        System.out.println(a+b) ;
       } else {
        System.out.println("Enter two int values as CLA") ;
       }
    }
    
}
