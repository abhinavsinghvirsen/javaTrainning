public class Lab398 {
    public static void main(String args[]){
        Hai2 hai=new Hai2();
        hai.a=99;
        Hello53 hello=new Hello53();
        System.out.println("main begin:"+hai.a);
        hello.m1(hai);
        System.out.println("main ends:"+hai.a);
    }
}
class Hello53{
    void m1(Hai2 hai){
        System.out.println("m1 begin:"+hai.a);
        hai=new Hai2();
        hai.a=hai.a+10;
        System.out.println("m1 ends:"+hai.a);
    }
}
class Hai2{
    int a;
}

