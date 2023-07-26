public class Lab399 {
    public static void main(String args[]){
        Hello54 h=new Hello54();
        h.sum(12,23);
    }
}
class Hello54{
    void sum(int a,int b){
        System.out.println("--sum(int,int)");
        System.out.println(a+b);
    }
}