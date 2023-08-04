public class Lab563_564 {

    public static void main(String[] args) {

        Demo563 dd = new Test563() ;

        dd.m1() ;

     //   dd.m2() ; Cannot resolve method 'm2' in 'Demo563'


    }
}

interface Demo563 {

    void m1() ;
}

class Test563 implements Demo563 {

    @Override
    public void m1() {
        System.out.println("Test563 -> m1()") ;

    }

    public void m2() {
        System.out.println("Test563 -> m2()") ;
    }
}
