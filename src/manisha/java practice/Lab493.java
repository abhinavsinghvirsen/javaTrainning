class Hello80{
    void m1(){
        System.out.println("Hello -> m1()");
    }
    void m2(){
        System.out.println("Hello -> m2()");
    }
}
class Hai22 extends Hello80{
    void m2(){
        System.out.println("Hello -> m2()");
    }
    void m3(){
        System.out.println("Hello -> m3()");
    }
}
public class Lab493 {
    public static void main(String args[]){
        Hai22 hai=new Hai22();
        hai.m1();
        hai.m2();
        hai.m3();
    }
}
