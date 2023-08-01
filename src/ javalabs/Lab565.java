public class Lab565 {


    public static void main(String[] args) {

        Demo565 dd = new Test565() ;

        Object obj = dd ;

        System.out.println(dd.toString()) ;

        dd.m1() ;

        //   dd.m2() ; Cannot resolve method 'm2' in 'Demo563'


    }
}

interface Demo565 {

    void m1() ;
}

class Test565 implements Demo565 {

    @Override
    public void m1() {
        System.out.println("Test565 -> m1()") ;

    }

    public void m2() {
        System.out.println("Test565 -> m2()") ;
    }
}

