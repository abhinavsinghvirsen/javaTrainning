package abhinav.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EXEC {

    public static void main(String[] args) {

        FoodPrepration t1 = new FoodPrepration();
        Decoration t2 = new Decoration();



        ExecutorService marriagerworker = Executors.newFixedThreadPool(4);

       // for (int i=0;i<3;i++){
        marriagerworker.execute(t1);
        marriagerworker.execute(t2);
        marriagerworker.execute(t2);
        marriagerworker.execute(t2);
        marriagerworker.execute(t2);
        marriagerworker.execute(t2);
        marriagerworker.execute(t2);
        marriagerworker.execute(t2);
        marriagerworker.execute(t2);


       // }




    }
}

class FoodPrepration implements Runnable{


    @Override
    public void run() {
     Thread tp=   Thread.currentThread();
     for (int j=0;j<5;j++) {
         System.out.println(" preparing food by" + tp.getName()+"  "+j);

         try {
             Thread.sleep(500);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
    }
}

class Decoration implements Runnable{


    @Override
    public void run() {
        Thread tp=   Thread.currentThread();
        for (int j=0;j<5;j++) {
            System.out.println(" decoration   by" + tp.getName()+"  "+j);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}