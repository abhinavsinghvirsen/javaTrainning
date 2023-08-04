public class Lab513 {
    public static void main(String args[]){
        B24 bobj=new B24();
        bobj.m1();
    }
}
class A24{
    void m1(){
        System.out.println("A -> m1()");
    }
}
class B24 extends A24{
    void m1(){
        System.out.println("B -> m1()");
    }
}
