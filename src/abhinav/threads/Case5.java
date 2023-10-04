package abhinav.threads;




import java.time.OffsetDateTime;

public class Case5{

    public static void main(String[] args) {
        Tom h1 = new Tom();

        Thread  t1 = new Thread(){

            @Override
            public void run() {
                h1.m1();
            }
        };

        Thread  t2 = new Thread(){

            @Override
            public void run() {
                h1.m2();
            }
        };

        t1.start();
        t2.start();

    }
}

class Ram{


    synchronized  static void  m1(){

        System.out.println("hi m1"+ OffsetDateTime.now());
    }

    synchronized void  m2(){
        System.out.println("hi m2"+OffsetDateTime.now());
    }

}
