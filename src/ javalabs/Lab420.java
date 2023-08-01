public class Lab420 {
    public static void main(String[] args) {




        New420 nn = new New420() ;

         nn.m1() ;
        nn.m2() ;
    }
}

class Demo420 {

    int a = 99 ;

     void m1() {
        System.out.println(" m1 : "+a) ;
        // System.out.println(" m1 : "+b) ;
    }
}

class New420 extends Demo420 {
    int b = 88 ;

    void m2() {
        System.out.println(" m2() : "+a) ;
        System.out.println(" m2() : "+b) ;
    }
}

