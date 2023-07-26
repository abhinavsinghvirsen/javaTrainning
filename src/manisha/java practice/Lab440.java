public class Lab440 {
    public static void main(String args[]){
        Hello75 h=new Hello75();
        h.show();
    }
}
class Hai17{
    int a=10;
}
class Hello75 extends Hai17{
    int a=20;
    void show(){
        int a=30;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}