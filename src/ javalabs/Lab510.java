public class Lab510 {

    public static void main(String[] args) {

        new Test510().m1() ;
    }
}

class Demo510 {


    protected  void m1() { }
    protected void m2() { }
}

class Test510 extends Demo510 {

    protected  void m1() { }
    public void m2() { }
}