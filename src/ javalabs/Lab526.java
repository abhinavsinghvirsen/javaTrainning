public class Lab526 {

    public static void main(String[] args) {
        Test526 tt = new Test526() ;

        tt.show();
    }
}

class Demo526 {
    int x = 10 ;
}

class Test526 extends  Demo526 {

    String x =
            "jlc" ;

    void show() {

        Test526 ref1 = this ;    Demo526 ref2 = this ;

        System.out.println(ref1.x + "\t" + ref2.x) ;  // jlc 10
    }
}