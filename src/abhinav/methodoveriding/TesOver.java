package abhinav.methodoveriding;

public class TesOver {

    public static void main(String[] args) {

     Book obj = new Book();

     obj.publish();//book
     obj.read();//book
     Book.read();//book




     Book obj1 = new PhyBook(); //dynamic

        obj1.publish(); //book phy
        obj1.read(); //
        PhyBook.read();




    }


}
