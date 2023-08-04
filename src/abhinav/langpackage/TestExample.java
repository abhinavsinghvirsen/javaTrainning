package abhinav.langpackage;



public class TestExample {
    public static void main(String[] args) {

       A obj = new B();
       Object objA = new A();
       Object objB = new B();

       Object ob[] = new Object[10];
       ob[0]=objA;
       ob[1]=new C();
        ((C)ob[1]).display();

    }
}

class A{


}

class B extends A{


}
class C{

    public void display(){

    }

}