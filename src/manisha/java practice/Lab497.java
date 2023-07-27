public class Lab497 {
    public static void main(String args[]){
        Hai23 hai=new Hai23();
        hai.m1();
    }
}
class Hello81{
    A m1(){
        return new A();
    }
}
class Hai23 extends Hello81{
    B m1(){
        return new B();
    }
}
class A{}
class B{}