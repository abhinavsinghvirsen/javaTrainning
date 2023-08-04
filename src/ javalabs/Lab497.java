public class Lab497 {

    public static void main(String[] args) {

    }
}
class X {}
class Y {}

class Demo497 {

    X m1() {

        return new X() ;
    }
}

class Test497 extends  Demo497 {

   /* Y m1() {

        return new Y() ;
    }*/
}
