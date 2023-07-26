public class Lab547 {

    public static void main(String[] args) {

        Demo547 dd = new Demo547() ;

        dd.m1() ;

        dd.m2() ;

        dd.m3() ;
    }
}

class Demo547 implements Inter1,Inter2 {

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

        System.out.println(B) ;

        System.out.println(C) ;


    }
}
