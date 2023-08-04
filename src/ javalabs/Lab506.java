public class Lab506 {

    public static void main(String[] args) {

        new Test506().m1() ;
    }
}

class Demo506 {
    private void m1() {}
}

class Test506 extends Demo506 {

    int m1() {
        return 0 ;
    }
}