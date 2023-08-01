public class Lab501 {
    public static void main(String args[]){
        B13 bobj=new B13();
        bobj.m1();
    }
}
class A13{
    void m1(){}
    }
class B13 extends A13{
    final void m1(){}
}
