public class Lab388 {
    public static void main(String args[]){
        Hello47 h=new Hello47();
        byte b=20;
        h.add(10,b);
        h.add(b,b);
    }
}
class Hello47{
    void add(byte a,int b){
        System.out.println("add(byte,int)");
    }
    void add(int a,byte b){
        System.out.println("add(int,byte)");
    }
}
