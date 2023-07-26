public class Lab438 {
    public static void main(String args[]){
        new C2();
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
class C2 extends B2{
    C2(){
        System.out.println("C-> D.C");
    }
}