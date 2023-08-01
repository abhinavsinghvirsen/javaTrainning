public class Lab422 {

    public static void main(String[] args) {




        Extra422 ee = new Extra422() ;

        ee.m1() ;
        ee.m2() ;
        ee.m3();
    }
}

class Demo422 {



    void m1() {
        System.out.println(" Demo422 :-> m1() ") ;
     }
}

class New422 extends Demo422 {


    void m2() {
        System.out.println(" New422 :->  m2()  ") ;

    }
}


class Extra422 extends New422 {


    void m3() {
        System.out.println(" Extra422 :->  m3()  ") ;

    }
}

