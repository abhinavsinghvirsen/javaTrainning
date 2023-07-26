public class Lab437 {
    public static void main(String args[]){
        new B2();
    }
}
class A2{
    A2(){
        System.out.println("A-> D.C");
    }
}
class B2 extends A2{
    B2(){
        System.out.println("B-> D.C");
    }
}