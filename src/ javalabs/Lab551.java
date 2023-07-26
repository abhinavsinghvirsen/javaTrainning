public class Lab551 {

    public static void main(String[] args) {

        New551 n1 = new New551() ;

        n1.show() ;
    }
}

interface  Demo551 {

    void show() ;

}

class Test551 {

    public void show() {

        System.out.println("Test551 -> show()") ;
    }
}

class New551 extends Test551 implements Demo551 {

}