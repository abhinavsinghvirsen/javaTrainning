public class Lab447 {
    public static void main(String args[]){
        new B6();
    }
}
class A6{
    A6(int a){
        System.out.println("A(int) Cons");
    }
}
class B6 extends A6{
    B6(){
        System.out.println("B-> D.C");
        super(30);
    }
}
