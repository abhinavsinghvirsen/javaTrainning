public class Lab391 {
    public static void main(String args[]){
        Hello49 h=new Hello49();
        h.show("JLC");
        h.show(h);
    }
}
class Hello49{
    void show(String str){
        System.out.println("show(String)");
    }
    void show(Hello49 str){
        System.out.println("show(Hello)");
    }
}
