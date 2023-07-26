public class Lab311 {
    public static void main(String args[]){
        Hey h=new Hey();
    }
}
class Hey{
    int a=10;
    static int b=20;
    {
        int c=30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
