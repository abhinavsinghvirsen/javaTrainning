public class Lab524 {

    public static void main(String[] args) {

        Demo524 dd = new Test524() ;
        dd.x = 99 ;
        System.out.println(dd.x) ; // 99
    }
}

class Demo524 {
    int x = 10 ;
}

class Test524 extends Demo524 {

    String x = "jlc " ;
}
