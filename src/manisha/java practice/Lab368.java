class Lab368{
    public static void main(String args[]){
        Hello30 h=new Hello30();
        System.out.println(h.show(10));
    }
}
class Hello30{
    long show(int x){
        System.out.println("show()");
        return x+1;
    }
}