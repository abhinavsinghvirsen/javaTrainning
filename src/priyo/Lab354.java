package priyo;

public class Lab354 {

    public static void main(String[] args) {


        Demo354.show() ;

    }
}


class  Demo354 {

    int a ;
    static int b ;

    static void show() {
       // System.out.println(a) ; Non-static field 'a' cannot be referenced from a static context
        System.out.println(b) ;
    }


}