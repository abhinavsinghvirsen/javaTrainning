public class Lab423 {

    public static void main(String[] args) {

        New423 nn = new New423() ;

        nn.m1() ;

        nn.m2() ;




        Extra423 ee = new Extra423() ;

        ee.m1() ;

        ee.m3();
    }
}

class Demo423 {



    void m1() {
        System.out.println(" Demo422 :-> m1() ") ;
    }
}

class New423 extends Demo423 {


    void m2() {
        System.out.println(" New422 :->  m2()  ") ;

    }
}


class Extra423 extends Demo423 {


    void m3() {
        System.out.println(" Extra422 :->  m3()  ") ;

    }
}
