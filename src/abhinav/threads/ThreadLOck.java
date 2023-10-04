package abhinav.threads;

public class ThreadLOck {

    public static void main(String[] args) {

         final Object Scooty = new Object();
         final Object bike = new Object();

         Thread priyo = new Thread(){
             @Override
             public void run() {

                 synchronized (bike){




                     System.out.println("priyo lock the bike waitting for the scooty");
                     try {
                         Thread.sleep(500);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                     synchronized (Scooty){
                         System.out.println("priyo have bike and scooty");
                     }

                 }


             }

         };

        Thread arpita = new Thread(){
            @Override
            public void run() {

                try {
                    Scooty.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                synchronized (Scooty) {
                    try {
                        Scooty.wait(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("arpita lock the scooty waitting for the scooty");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (bike) {
                        System.out.println("arpita have bike and scooty");
                    }

                }

            }
            };



        priyo.start();
        arpita.start();

    }

}


