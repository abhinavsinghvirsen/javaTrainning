package abhinav.methodoveriding;

public class Book {

     public static void read(){
          System.out.println("book");

     }


       void publish(){
          System.out.println("book");

     }

}
class PhyBook extends  Book{

     public  static void read(){
          System.out.println("phy bok");

     }

     public  void publish(){
          System.out.println("phy -- book");

     }

}