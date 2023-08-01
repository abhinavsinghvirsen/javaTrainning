public class Lab508 {
    public static void main(String args[]){
        new B19().m1();
    }
}
class A19{
    void m1(){}
    void m2(){}
    void m3(){}
    }
class B19 extends A19{
    void m1(){}
    protected void m2(){}
    public void m3(){}
}
