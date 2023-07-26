public class Lab527 {

    public static void main(String[] args) {

        Test527 tt = new Test527() ;

        Demo527 dd =  tt ;

        dd.x = 88 ;
        tt.x = "SRI" ;

        tt.show() ;

    }
}

class Demo527 {

    int x = 10 ;
}

class Test527 extends  Demo527 {

    String x ="jlc" ;

    void show() {
        System.out.println(x) ;  // SRI
        System.out.println(super.x) ;  // 88
    }
}