public class Lab392 {
    public static void main(String args[]){
        Hello50 h=new Hello50();
        h.show(null);
    }
}
class Hello50{
    void show(String str){
        System.out.println("show(String)");
    }
    void show(Hello50 str){
        System.out.println("show(Hello)");
    }
}
