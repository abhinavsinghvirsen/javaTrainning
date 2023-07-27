public class Lab515 {
    public static void main(String args[]){
        B26 bobj=new B26();
        bobj.m1();
    }
}
class A26{
    static void m1(){
        System.out.println("A -> m1()");
    }
}
class B26 extends A26{
    static void m1(){
        System.out.println("B -> m1()");
    }
}
