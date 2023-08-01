public class Lab321 {
    public static void main(String args[]){
        System.out.println("Main:"+Hello3.a);
    }
}
class Hello3{
    static{
        int a=10;
        System.out.println("S.Block:"+a);
    }
}
