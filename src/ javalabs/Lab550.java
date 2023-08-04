public class Lab550 {

    public static void main(String[] args) {

        Demo550 dd = new Demo550() ;

        Inter1 ref1 = dd ;

        ref1.m1() ;

        ref1.m2() ;

        Inter2 ref2 = dd ;

        ref2.m2() ;

        ref2.m3() ;

    }
}

class Demo550 implements Inter1,Inter2 {

    @Override
    public void m1() {

        System.out.println("Demo547 -> m1()");
    }

    @Override
    public void m2() {

        System.out.println("Demo547 -> m2()");

    }

    @Override
    public void m3() {

        System.out.println("Demo547 -> m3()");


        System.out.println(Inter1.A);

        System.out.println(Inter2.A);

        System.out.println(B);

        System.out.println(C);

    }

}

