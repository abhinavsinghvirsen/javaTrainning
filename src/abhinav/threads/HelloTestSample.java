package abhinav.threads;

public class HelloTestSample {

    public static void main(String[] args) {

    }
}
class TestHello{

    void m1(){

        synchronized (this.getClass()){

            System.out.println("m1");
        }
    }

    static void m2(){

        synchronized (TestHello.class){


        }

    }

    void m3(){

        synchronized (this){


        }
    }

    void m4(){

        Integer obj = 4;

        synchronized (obj){


        }


    }
}