public class Lab501 {

    public static void main(String[] args) {

        Test500 tt = new Test500() ;
        tt.m1() ;
    }
}

class Demo501 {
     void m1() { }
}
class Test501 extends Demo501 {


   final void m1() { }
}
