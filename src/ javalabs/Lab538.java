public class Lab538 {

    public static void main(String[] args) {

        Test538 tt = new Test538(10) ;

        tt.show() ;
    }
}

abstract class Demo538 {

    int a ;

    Demo538(int a) {
        this.a = a ;
        System.out.println("Hello (int) Cons") ;
    }

    {
        System.out.println("Hello ->I.B") ;
    }

    void show() {
        System.out.println("Hello -> show()") ;
    }
}

class Test538 extends Demo538 {

    Test538(int a) {
       super(a) ;
   }
}