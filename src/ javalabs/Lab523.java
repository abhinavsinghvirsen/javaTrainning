public class Lab523 {

    public static void main(String[] args) {

        Demo523 obj = new Test523() ;

        System.out.println(obj.x) ;
    }
}

class Demo523 {

    int x = 10 ;
}

class Test523 extends  Demo523 {

    String x = "jlc" ;
}
