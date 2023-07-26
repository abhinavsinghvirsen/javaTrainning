public class Lab515 {

    public static void main(String[] args) {

        new Test515().m1();
    }
}

class Demo515 {
    static void m1() {
        System.out.println("Demo -> m1()");
    }
}

class Test515 extends Demo515 {

    static void m1() {
        System.out.println("Test -> m1()");

    }
}
