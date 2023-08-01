public class Lab505 {

    Test505 tt = new Test505() ;
       // tt.m1() ;
}


class Demo505 {
     native void m1()  ;
     void m2() { }
}
class Test505 extends Demo505 {

    void m1() { }

    native void m2() ;
}
