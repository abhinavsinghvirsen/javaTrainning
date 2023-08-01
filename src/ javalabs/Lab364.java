public class Lab364 {

    public static void main(String[] args) {

        Demo364 dd = new Demo364() ;

        dd.show(10) ;
        System.out.println("hello guys") ;

        // System.out.println(dd.show(10) ) ; Cannot resolve method 'println(void)'
    }
}

class Demo364 {

    void show(int x) {
        System.out.println(" show() method " ) ;
    }
}


//    show() method
//    hello guys
