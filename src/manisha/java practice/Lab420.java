class Lab420{
    public static void main(String args[]){
        Hello67 hello=new Hello67();
        hello.m1();
        hello.m2();
    }
}
class Hai6{
    int a=99;
    void m1(){
    System.out.println("Hai->m1:"+a);
    System.out.println("Hai->m1:"+b);
    }
}
class Hello67 extends Hai6{
    int b=88;
    void m2(){
    System.out.println("Hello->m1:"+a);
    System.out.println("Hello->m1:"+b);
    }
}