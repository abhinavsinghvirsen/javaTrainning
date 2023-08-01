public class Lab445 {
    public static void main(String args[]){
        new B4();
    }
}
class A4{
    A4(int a){
        System.out.println("A(int) Cons");
    }
}
class B4 extends A4{
    B4(){
        super();
        System.out.println("B-> D.C");
    }
}
