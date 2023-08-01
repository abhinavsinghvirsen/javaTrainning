public class Lab494 {

    public static void main(String[] args) {

        Tesy494 tt = new Tesy494() ;

        tt.SHOW() ;
        tt.show() ;
    }
}

class Demo494 {
    void show() {
        System.out.println("hii") ;
    }
}

class Tesy494 extends Demo494 {

    void SHOW() {
        System.out.println("SHOW() method") ;
    }
}