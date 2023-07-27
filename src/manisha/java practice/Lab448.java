public class Lab448 {
   public static void main(String args[]){
        new B7(10);
    }
}
class A7{
    A7(){
        System.out.println("A -> D.C");
    }
}
class B7 extends A7{
    B7(){
        System.out.println("B-> D.C");
    } 
    B7(int a){
        this();
        System.out.println("B(int)");
    }
}
