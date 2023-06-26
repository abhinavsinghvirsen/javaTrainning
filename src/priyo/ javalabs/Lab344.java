public class Lab344 {

    public static void main(String[] args) {

        Hello4 h4 = new Hello4( 199) ; // call parameterized constructor
        //  Hello4 h4 = new Hello4( 199) ;  call default constructor
       // h4.a = 199 ;
        h4.show() ;

    }
}

class Hello4 {

    int a ;

    Hello4() {
        System.out.println("Hello4 default constructor") ;
    }

    Hello4(int a) {
        System.out.println("Hello4 paramiterized constructor") ;
        this.a = a ;
    }

    void show() {
        System.out.println(a) ;
    }
}
