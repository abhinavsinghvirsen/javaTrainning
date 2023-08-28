package abhinav.cloning;

public class TestClone {

    public static void main(String[] args) throws CloneNotSupportedException {


       Book phy= new Book("phy",300);
        Student Abhinav = new Student("abhinav",3,50,"HIG",phy);

        Student ravi= (Student) Abhinav.clone();
        ravi.name="ravi";
        Abhinav.book1.name="chem";
        System.out.println(Abhinav);
        System.out.println(ravi);


    }




}



class Student implements Cloneable {

      String name;
      int roll;
      int mark;
      String address;
      Book book1;

    public Student(String name, int roll, int mark, String address, Book book1) {
        this.name = name;
        this.roll = roll;
        this.mark = mark;
        this.address = address;
        this.book1 = book1;
    }

    public Student(String name, int roll, int mark, String address) {
        this.name = name;
        this.roll = roll;
        this.mark = mark;
        this.address = address;
    }


    public Object clone() throws CloneNotSupportedException{

        if(this instanceof Cloneable){

            Book cloneofbook = new Book(this.book1.name, this.book1.price);

            Student cloneofStudent = new Student(this.name, this.roll, this.mark, this.address, cloneofbook);

            return cloneofStudent;
        }else{
            throw new CloneNotSupportedException();
        }


     //   return  super.clone();

    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", mark=" + mark +
                ", address='" + address + '\'' +
                ", book1=" + book1 +
                '}';
    }
}

class Book{

   String name;
   int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
