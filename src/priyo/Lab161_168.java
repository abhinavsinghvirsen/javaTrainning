package priyo;

public class Lab161_168 {
    
    public static void main(String[] args) {
        
        if(true)
        System.out.println("if block") ;
        System.out.println("Hello") ;

        if(false)
        System.out.println("if block") ;
        System.out.println("hii") ;

        if(false){
            System.out.println("if block") ;
            System.out.println("hi") ;

        }

        int a = 99 ;

        if(a==99)
        System.out.println("value is 99") ;
        System.out.println("helo") ;

        int b = 88 ;

        if(b==99)

        System.out.println("value is 99") ;
        System.out.println("welcome") ;

        if(a==99) {

            int c = 12 ;
            System.out.println(c) ;
            System.out.println(a) ;
        }
        System.out.println(a) ;
       // System.out.println(c) ;  c cannot be resolved to a variable

        if(a%2==0) {

            System.out.println("no is even") ;

        }else{

            System.out.println("no is odd") ;
        }





    }
}
