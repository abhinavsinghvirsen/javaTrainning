public class Lab400 {
    public static void main(String args[]){
        Hello55 h=new Hello55();
        h.sum(12,23);
        h.sum(12,32,43);
    }
}
class Hello55{
    void sum(int a,int b){
        System.out.println("--sum(int,int)");
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println("--sum(int,int,int)");
        System.out.println(a+b);
    }
}
