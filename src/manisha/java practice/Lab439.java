public class Lab439 {
    public static void main(String args[]){
        new C3();
    }
}
class A3{
    A3(){
        System.out.println("A-> D.C");
    }
    static{
        System.out.println("A -> S.B");
    }
    {
        System.out.println("A-> I.B");
    }
}
class B3 extends A3{
    B3(){
        System.out.println("B-> D.C");
    }
    static{
        System.out.println("B -> S.B");
    }
    {
        System.out.println("B-> I.B");
    }
}
class C3 extends B3{
    C3(){
        System.out.println("C -> D.C");
    }
    static{
        System.out.println("C -> S.B");
    }
    {
        System.out.println("C-> I.B");
    }
}
