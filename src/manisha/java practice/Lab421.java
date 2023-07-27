public class Lab421 {
    public static void main(String args[]){
        Hello68 hello=new Hello68();
        hello.m1();
        hello.m2();
    }
}
class Hai7{
    int a=99;
    void m1(){
    System.out.println("Hai->m1:"+a);
    // System.out.println("Hai->m1:"+b);
    }
}
class Hello68 extends Hai7{
    int b=88;
    void m2(){
    System.out.println("Hello->m1:"+a);
    System.out.println("Hello->m1:"+b);
    }
}
