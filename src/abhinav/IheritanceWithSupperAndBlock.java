package abhinav;

public class IheritanceWithSupperAndBlock {

    public static void main(String[] args) {

        System.out.println("In main");

        B obj = new B();
        obj.display();

    }
}

class A{


A(){


}


    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x;
    int y;
    static int z=30;

    static{
        System.out.println("static A");
    }

    {

        System.out.println("non static b A");
    }

  public  void displayv(){

        System.out.println("class A");

    }
}

class B extends A{

    B(){
super();
        System.out.println("B constructur");

    }

    int d;
    int e;

    public B(int d, int e) {

        this.d= d;
        this.e = e;

    }

    static int z=40;

    static{
        System.out.println("static B");
    }

    {

        System.out.println("non static b B");
    }

   public   void display(){
  int z=35;
        System.out.println("class B");

      // System.out.println(this.z);
       System.out.println(this.e);
       System.out.println(this.d);
       System.out.println(super.x+" "+super.y);

    }
}
class C extends  B{


    C(){

       super ();
    }
}