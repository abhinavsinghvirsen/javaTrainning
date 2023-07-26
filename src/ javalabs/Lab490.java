public class Lab490 {

    public static void main(String[] args) {


        Demo490 dd = new Demo490(99);
         dd.show() ;
    }
}

class Demo490 {

    private int x ;

    public Demo490(int x) {
        this.x = x ;
    }

    void show() {
        System.out.println(x) ;
    }
}
