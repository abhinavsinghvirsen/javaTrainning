public class Lab514 {

    public static void main(String[] args) {

        new Test514().m1();
    }
}

class Demo514 {
    void m1() {
        System.out.println("Demo -> m1()");
    }
}

class Test514 extends Demo514 {

    void m1() {

        System.out.println("Test -> m1()");

        super.m1() ;

    }
 }
