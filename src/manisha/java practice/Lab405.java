public class Lab405 {
    public static void main(String args[]){
        Hello60 h1=new Hello60();
        h1.m1();
    }
}
class Hello60{
    void m1(int...a){
        System.out.println("m1(int...)");
    }
    void m1(String...a){
        System.out.println("m1(String...)");
    }
}
