public class Lab396 {
    public static void main(String args[]){
        int a=99;
        Hello51 h=new Hello51();
        System.out.println("main begin:"+a);
        h.m1(a);
    }
}
class Hello51{
    void m1(int a){
        System.out.println("m1 begin:"+a);
        a= a+10;
        System.out.println("m1 ends:"+a);
    }
}
