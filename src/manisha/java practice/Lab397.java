public class Lab397 {
    public static void main(String args[]){
        Hai1 hai=new Hai1();
        hai.a=99;
        Hello52 hello=new Hello52();
        System.out.println("main begin:"+hai.a);
        hello.m1(hai);
        System.out.println("main ends:"+hai.a);
    }
}
class Hello52{
    void m1(Hai1 hai){
        System.out.println("m1 begin:"+hai.a);
        hai.a=hai.a+10;
        System.out.println("m1 ends:"+hai.a);
    }
}
class Hai1{
    int a;
}
