package abhinav;

public class ExampleModifier {

    static  public  void main(String []args) {//call by jvm


        Hello obj = new Hello();



    }
}


class Hello{

    int a=99;
    static int b=88;
    Hello(){
        System.out.println("D C");

    }

    {

        System.out.println("I B");
    }

    static {
        System.out.println("S B ");
    }


    double preparejalebi(int kg){

        System.out.println("prarparing jalebi");
        System.out.println("done");
        double sum= kg*100;
        return sum;

    }

    double visit(){


        return 10;

    }

    String print(String name){

        return name;
    }

}