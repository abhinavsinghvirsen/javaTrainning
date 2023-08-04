public class Lab530_534 {

    public static void main(String[] args) {

        Shape530 sp = new Square530() ;
        sp.area() ;
    }
}

 abstract class Shape530 {
   abstract void area() ;
}

class Square530 extends Shape530  {

    void area() {
        System.out.println("Square -> area") ;
    }
}