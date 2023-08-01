public class Lab514 {
    public static void main(String args[]){
        B25 bobj=new B25();
        bobj.m1();
    }
}
class A25{
    void m1(){
        System.out.println("A -> m1()");
    }
}
class B25 extends A25{
    void m1(){
        System.out.println("B -> m1()");
        super.m1();
    }
}
