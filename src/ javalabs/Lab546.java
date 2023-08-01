public class Lab546 {

    public static void main(String[] args) {

        New546 nn = new New546() ;

        System.out.println(nn.A) ;
        System.out.println(nn.B) ;

        nn.m1() ;

        nn.m2() ;
    }

}

interface Demo546 {

    void m1() ;
    int A = 10 ;
}

interface Test546 {

    void m2() ;
    int B = 11 ;
}

class New546 implements Demo546,Test546 {

    @Override
    public void m1() {
        System.out.println("m1() -> method") ;
    }

    @Override
    public void m2() {
        System.out.println("m2() -> method") ;
    }
}