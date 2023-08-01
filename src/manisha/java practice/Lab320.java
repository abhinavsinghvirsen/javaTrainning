public class Lab320 {
    public static void main(String args[]){
        Hello2 h=new Hello2();
        System.out.println("Main:"+h.a);
    }
}
class Hello2{
    {
    int a=10;
    System.out.println("I.Block 2:"+a);
    }
}
