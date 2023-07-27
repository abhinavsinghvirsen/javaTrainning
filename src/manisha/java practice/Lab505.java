public class Lab505 {
    public static void main(String args[]){
        new B17().m1();
    }
}
class A17{
    native void m1(){}
    void m2(){}
    }
class B17 extends A17{
    void m1(){}
    native void m2(){}
}
