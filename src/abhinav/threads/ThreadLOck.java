package abhinav.threads;

public class ThreadLOck {

    public static void main(String[] args) {


         final Object Scooty = new Object();
         final Object bike = new Object();

         Thread priyo = new Thread(new Runnable(){
             @Override
             public void run() {
                 synchronized (bike){

                     System.out.println("priyo lock the bike waitting for the scooty");

                     synchronized (Scooty){

                         System.out.println("priyo have bike and scooty");
                     }

                 }


             }

         });





        Thread arpita = new Thread(new Runnable(){
            @Override
            public void run() {
                synchronized (bike){

                    System.out.println("arpita lock the scooty waitting for the scooty");

                    synchronized (Scooty){

                        System.out.println("arpita have bike and scooty");
                    }

                }


            }

        });

        priyo.start();
        arpita.start();

    }

}


