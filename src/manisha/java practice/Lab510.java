public class Lab510 {
    public static void main(String args[]){
        new B21().m1();
    }
}
class A21{
    protected void m1(){}
    protected void m2(){}
}
class B21 extends A21{
    protected void m1(){}
    public void m2(){}
}
