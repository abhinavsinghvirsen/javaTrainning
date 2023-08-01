public class Lab495 {

    public static void main(String[] args) {

        Test495 tt = new Test495() ;
        tt.show(99) ;
        tt.show("qwe") ;
    }
}

class Demo495 {

    void show(int ab) {
        System.out.println("show(int)") ;
    }
}

class Test495 extends Demo495 {

    void show(String ab) {
        System.out.println("show(string)") ;
    }
}