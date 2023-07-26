public class Lab548 {


    public static void main(String[] args) {

        Demo548 dd = new Demo548() ;

        dd.m1() ;

        dd.m2() ;

        dd.m3() ;
    }
}

class Demo548 implements Inter1,Inter2 {

    @Override
    public void m1() {

        System.out.println("Demo547 -> m1()") ;
    }

    @Override
    public void m2() {

        System.out.println("Demo547 -> m2()") ;

    }

    @Override
    public void m3() {

        System.out.println("Demo547 -> m3()") ;

      //  System.out.println(A) ; Reference to 'A' is ambiguous, both 'Inter1.A' and 'Inter2.A' match

        System.out.println(B) ;

        System.out.println(C) ;


    }
}

