public class Lab544 {

    public static void main(String[] args) {

        System.out.println("Hello Guys") ;

        Demo544 dd = null ;

      //  dd = new Demo544() ;

        dd = new Test544() ;

        dd.m1() ;

        dd.m2() ;


    }
}

interface Demo544 {

    void m1() ;

    public abstract void m2() ;

    int A = 19 ;

    public final static  int B = 20 ;

}


class Test544 implements Demo544 {

    @Override

 public void m1() {
        System.out.println("m1() method") ;
    }


    @Override
    public void m2() {

        System.out.println("m2() method") ;
    }
}

