package abhinav.threads;

public class SimpleThread {

    public static void main(String[] args) {

  ThreadPower p1 = new ThreadPower();
 // ThreadPower p2 = new ThreadPower();
   p1.name="ram";
 //  p2.name="shyam";
  ThreadGen t1 = new ThreadGen(p1);
  ThreadGen t2 = new ThreadGen(p1);

  Thread th1 = new Thread(t1);
  Thread th2 = new Thread(t2);
  th1.setName("rAM");
  th2.setName("shyam");
  th2.start();
  th1.start();




    }
}


class ThreadPower{

  public static  int i = 10;
    String name;




     public   synchronized    void   m1() throws InterruptedException {


        Thread t = Thread.currentThread();

        for(int j=0;j<5;j++){
            i=i+10;
            System.out.println("hello"+t.getName()+""+"   "+this.name+i);
            Thread.sleep(500);
        }


       Integer a = new Integer(5);



             System.out.println("local block");

        synchronized (a){
             a = a + 20;


            System.out.println(a);
        }







       }
    public synchronized static void m2( ){

        System.out.println(Thread.currentThread().getName());

    }



}


class ThreadGen implements  Runnable{


    ThreadPower  obj;

    public ThreadGen(ThreadPower obj) {
        this.obj = obj;
    }

    @Override
    public void run() {

        try {
            this.obj.m1();
            ThreadPower.m2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}