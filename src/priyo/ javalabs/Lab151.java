 class Hii {

 }

public class Lab151 {
    
    public static void main(String[] args) {
        
        Lab151 l1 = new Lab151() ;

        System.out.println(l1 instanceof Lab151) ; // true

        System.out.println(l1 instanceof Object) ; // true

       // System.out.println(l1 instanceof String) ; Incompatible conditional operand types
         
       Object obj = new Hii() ;

       System.out.println(obj instanceof Object) ;
       System.out.println(obj instanceof Hii) ;
       System.out.println(obj instanceof String) ;




    }
}
