package abhinav.langpackage;


import java.sql.SQLOutput;
import java.util.Arrays;

public  class TestExample {
    public static void main(String[] args) {
        B obj = new B();
        A obx =new A();


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


}

class B extends A{

double name;
}


