package single.designpatterns;

public class Lab703 {


    public static void main(String[] args) {

        Hello703 h = Hello703.getHello() ;

        System.out.println(h) ;

        System.out.println(Hello703.getHello()) ;

        System.out.println(Hello703.getHello()) ;
    }
}


class Hello703 {

    private static Hello703 INS =  null ;

    static {

        INS = new Hello703() ;
    }
    private Hello703() { }

    public static Hello703 getHello() {

        return  INS ;
    }
}
