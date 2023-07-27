public class Lab401 {
    public static void main(String args[]){
        Hello56 h=new Hello56();
        h.sum(new int[0]);
        h.sum(new int[]{12,34,54});
        h.sum(new int[]{10,20,30,50});
    }
}
class Hello56{
    void sum(int arr[]){
        System.out.println("--sum(int[])");
        System.out.println("Length:"+arr.length);
        int s=0;
        for(int a:arr){
            s=s+a;
        }
        System.out.println("Sum is:"+s);
    }
}
