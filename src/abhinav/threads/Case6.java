package abhinav.threads;






import java.time.OffsetDateTime;

public class Case6{

    public static void main(String[] args) {
        Shyam h1 = new Shyam();
        Shyam h2 = new Shyam();

        Thread  t1 = new Thread(){

            @Override
            public void run() {
                h1.m1();
            }
        };

        Thread  t2 = new Thread(){

            @Override
            public void run() {
                Shyam.m2();
            }
        };

        t1.start();
        t2.start();

    }
}

class Shyam{


    synchronized  static void  m1(){

        System.out.println("hi m1"+ OffsetDateTime.now());
    }

    synchronized static void  m2(){
        System.out.println("hi m2"+OffsetDateTime.now());
    }

}

