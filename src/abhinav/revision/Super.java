package abhinav.revision;

public class Super {

    int a;

    public static void main(String[] args) {

        Super obj = new Base();
        obj.sumofnum();

        obj.test();


    }

    public static void test(){
        System.out.println("s t");

    }


    public  void sumofnum(){

        System.out.println("super sum");

    }


}
class Base extends Super{
int a;
    public void sumofnum(){

        System.out.println("Base sum"+this.a);

    }

    public static void test(){

        System.out.println("b t");
    }

}