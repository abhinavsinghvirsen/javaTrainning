public class Lab446 {
    public static void main(String args[]){
        new B5();
    }
}
class A5{
    A5(int a){
        System.out.println("A(int) Cons");
    }
}
class B5 extends A5{
    B5(){
        super(10);
        System.out.println("B-> D.C");
    }
}
