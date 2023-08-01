public class Lab500 {

    public static void main(String[] args) {

        Test500 tt = new Test500() ;
        tt.m1() ;
    }
}

class Demo500 {
   final void m1() { }
}
class Test500 extends Demo500 {


   // void m1() { }
}
