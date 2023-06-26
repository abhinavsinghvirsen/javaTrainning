public class Lab339 {
    public static void main(String[] args) {

        Hello1 h1 = new Hello1() ;
        h1.show() ;

    }
}

class Hello1 {

    int a = 10 ;

    void show() {
        String a = "jc" ;

        System.out.println(a) ;  // jc

        System.out.println(a) ; // jc
    }
}
