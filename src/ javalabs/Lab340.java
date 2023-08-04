public class Lab340 {
    public static void main(String[] args) {

        Hello2 h1 = new Hello2() ;
        h1.show() ;

    }
}

class Hello2 {

    int a = 10 ;

    void show() {
        String a = "jc" ;

        System.out.println(a) ;  // jc

        System.out.println(this.a) ; // 10
    }
}