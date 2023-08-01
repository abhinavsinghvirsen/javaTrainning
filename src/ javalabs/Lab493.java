public class Lab493 {

    public static void main(String[] args) {

        Test493 tt = new Test493() ;
        tt.m1();
        tt.m2();
        tt.m3();

    }
}

class Demo493 {
    void m1() {
        System.out.println("Demo->m1()") ;
    }

    void m2() {
        System.out.println("Demo->m2()") ;
    }
}

class Test493 extends Demo493 {

    void m2() {
        System.out.println("Test->m2()") ;
    }

    void m3() {
        System.out.println("Test->m3()") ;
    }

}
