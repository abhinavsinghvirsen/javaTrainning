public class Lab504 {

    public static void main(String[] args) {

        Test502 tt = new Test502() ;
        tt.m1() ;
    }
}

class Demo504 {
    void m1() { }
    static void m2() { }
}
class Test504 extends Demo504 {

    void m1() { }

     static void m2() { }
}
