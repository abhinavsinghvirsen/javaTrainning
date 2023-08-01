public class Lab382 {
    public static void main(String args[]){
        Hello44 h=new Hello44();
        int a=h.add(10,20);
        System.out.println(a);
        h.add(10,20);
    }    
}
class Hello44{
    int add(int a,int b){
        System.out.println("add(int,int)");
        return a+b;
    }
    void add(int a,int b){
        System.out.println("add(int,int)");
    }
}
