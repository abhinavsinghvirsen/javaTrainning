class Lab293 {
    public static void main(String args[]){
        Bye b = new Bye();
        System.out.println(b.b);
        b.b=99;
        System.out.println(b.b);
    }
}
class Bye{
    static int b;
}
