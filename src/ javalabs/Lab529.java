public class Lab529 {

    public static void main(String[] args) {

        Shape sp = new Square() ;
        sp.area() ;
    }
}

class Shape {

    void area() {

    }
}

class Square extends  Shape { }
