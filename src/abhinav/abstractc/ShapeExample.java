package abhinav.abstractc;

public class ShapeExample {

    public static void main(String[] args) {


        Shape obj = new squre();






    }


}

abstract class Shape{

    Shape(){

        System.out.println("Hellloooo");
    }

    {

        System.out.println("hellooo");
    }

    abstract void area();




}

 class squre extends  Shape{

     void measurement(){

         System.out.println("bye");
     }
     @Override
     void area() {

     }
 }

class rectangle extends  Shape{


    @Override
    void area() {

    }
}

class temp extends Shape{


    @Override
    void area() {

    }
}


