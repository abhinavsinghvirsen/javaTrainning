public class Lab525 {

    public static void main(String[] args) {

        Test525 tt = new Test525() ;
        tt.show() ;
    }
}
class Demo525 {
    int x = 10 ;
}

class Test525 extends Demo525 {

    String x = "jlc" ;

    void show() {
        System.out.println(x) ; // jlc
        System.out.println(super.x) ; // 10
    }
}