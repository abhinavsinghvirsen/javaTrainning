package abhinav.classcast;

public class TestCast {

    public static void main(String[] args) {




        P1 obj = new P1();
        P1 obj2 =new P1();

        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj==obj2);




        

    }







}

interface A{
     void show();


}

interface B{
    int show();


}

class P1 implements A{


    @Override
    public void show() {

    }
}
class P2 implements B{


    @Override
    public int show() {
        return 0;
    }
}

