package abhinav.threads;

public class TestClass {
    public static void main(String[] args) {

        Time tobj = new Time();
        Time tobj2 = new Time();

        OwnThread t1 = new OwnThread(tobj);
        OwnThread t2 = new OwnThread(tobj2);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }

}



class Time{

   void show(){

       Thread th= Thread.currentThread();

       synchronized (this){

           for (int i=0;i<5 ;i++  ){

               System.out.println(th.getName() + "show " + i  + "   "+this);

               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }


           }

       }
   }
}

 class OwnThread extends  Thread{

    Time tim =null;

    OwnThread(Time tx){
        this.tim=tx;
    }

    public void run(){

        tim.show();
    }

 }