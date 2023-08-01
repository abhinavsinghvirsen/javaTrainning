class Lab294 {
    public static void main(String args[]){
        Bye h1=new Bye();
        Bye h2=new Bye();
        System.out.println(h1.b+"\t"+h2.b);
        h1.b=99;
        System.out.println(h1.b+"\t"+h2.b);
    }
}
class Bye{
   static int b;
}
