public class Lab442 {
    public static void main(String args[]){
        Hello77 h=new Hello77();
        h.show();
    }
}
class Hai19{
    static int a=10;
}
class Hello77 extends Hai19{
    static int a=20;
    void show(){
        int a=30;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
