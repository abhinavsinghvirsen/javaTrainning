package abhinav.langpackage;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;

public  class TestExample {
    public static void main(String[] args) {
        B obj = new B();
        B objy =obj;
        A obx =new A();


        System.out.println(obj.hashCode());
        System.out.println(objy.hashCode());

        System.out.println(obj==obj);

        display(obj);
        display(obx);


    }

    private static void display(Object obj) {
        Class details = obj.getClass();
        System.out.println(details.getName());
        System.out.println(details.getSuperclass());
        System.out.println(Arrays.stream(details.getDeclaredFields()));
        System.out.println(Arrays.stream(details.getDeclaredFields()).findFirst());

    }


}

class A{
    @Override
    public int hashCode() {
        return 1;
    }

}

class B extends A{

double name;



    @Override
    public int hashCode() {
        return 1;
    }
}


