public class Lab498 {

    public static void main(String[] args) {

        Test498 tt = new Test498() ;
        tt.m1() ;
    }
}
class Xx {}
class Yy {}

class Demo498 {

    Xx m1() {

        return new Xx() ;
    }
}

class Test498 extends Demo498 {

    Xx m1() {
        return new Xx() ;
    }
}
