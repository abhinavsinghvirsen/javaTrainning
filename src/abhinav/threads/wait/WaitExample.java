package abhinav.threads.wait;

import java.time.OffsetDateTime;

import static java.lang.Thread.sleep;

public class WaitExample {

    public static void main(String[] args) throws InterruptedException {
        HelloM objh = new HelloM();
        THreadSample obj = new THreadSample(objh);
        THreadSample obj2 = new THreadSample(objh);

                obj.start();
                obj2.start();
               // objh.notifyThread();




    }

}
class THreadSample extends Thread{

    HelloM m;

    public THreadSample(HelloM m) {
        this.m = m;
    }

    public void run(){
        m.show();

    }




}
class HelloM{

     void show()  {

        Thread t= Thread.currentThread();
        String str = new String("resource");
         synchronized (str) {
             for (int i = 0; i < 5; i++) {
                 try {
                     str.wait(200);
                     System.out.println(t.getName() + " " + t.getState() + "- show  " + i + this + ""+ OffsetDateTime.now());
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }


             }
         }

    }



}

