package abhinav.threads;

import java.time.OffsetDateTime;

public class Case1 {

    public static void main(String[] args) {
        Max h1 = new Max();
        Max h2 = new Max();

        Thread  t1 = new Thread(){

            @Override
            public void run() {
                h1.m1();
            }
        };

        Thread  t2 = new Thread(){

            @Override
            public void run() {
                h2.m2();
            }
        };

        t1.start();
        t2.start();

    }
}

class Max{


  synchronized  void  m1(){
      System.out.println("hi m1"+ OffsetDateTime.now());
    }

    synchronized void  m2(){
        System.out.println("hi m2"+OffsetDateTime.now());
    }

}