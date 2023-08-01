public class Lab509 {
    public static void main(String args[]){
        new B20().m1();
    }
}
class A20{
    protected void m1(){}
    protected void m2(){}
}
class B20 extends A20{
    void m1(){}
    void m2(){}
}
