public class Lab499 {

    public static void main(String[] args) {

        Test499 tt = new Test499() ;
        tt.m1() ;
    }
}
class Xxx {}
class Yyy extends Xxx {}

class Demo499 {

    Xxx m1() {

        return new Xxx() ;
    }
}

class Test499 extends Demo499 {

    Yyy m1() {
        return new Yyy() ;
    }
}

