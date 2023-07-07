package priyo;

public class Lab341 {
    public static void main(String[] args) {

        Hello1 h1 = new Hello1() ;
        h1.show() ;

    }
}

class Hello3 {

    int a = 10 ;
    static int b = 20 ;

    void show() {
        String a = "jc" ;

        System.out.println(a) ;  // jc

        System.out.println(this.a) ; // 10

        System.out.println(this.b) ;  // 20
    }
}
