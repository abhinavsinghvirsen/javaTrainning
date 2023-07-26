public class Lab418 {

    public static void main(String[] args) {
        Demo418 dd = new Demo418() ;

        System.out.println(dd.a) ;
       //  System.out.println(dd.b) ;


        New418 nn = new New418() ;

          System.out.println(nn.a) ;
        System.out.println(nn.b) ;
    }
}

class Demo418 {

    int a = 99 ;
}

class New418 extends Demo418 {
    int b = 88 ;
}

