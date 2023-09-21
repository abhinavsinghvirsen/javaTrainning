package abhinav.threads;

public class ThreadExamplePrirityNAmeGroup {

    public static void main(String[] args) {

        Priyoo p = new Priyoo();
        Rohits r = new Rohits();

        ThreadGroup odisha = new ThreadGroup("odisha");
        ThreadGroup bihar = new ThreadGroup("bihar");

        Thread t1= new Thread(odisha,p,"priyoo");
        Thread t2= new Thread(bihar,r,"rohit");
        Arpit t3 = new Arpit(odisha,"aprita");

        t3.setPriority(10);
        t1.setPriority(5);
        t2.setPriority(1);
        t1.start();
        t2.start();



    }
}

class Priyoo implements Runnable{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +"    "+Thread.currentThread().getThreadGroup().getName() +"  "+
       Thread.currentThread().getPriority());
    }
}
class  Rohits implements Runnable{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +"    "+Thread.currentThread().getThreadGroup().getName() +"  "+
                Thread.currentThread().getPriority());
    }

}

class Arpit extends Thread{

    public Arpit(ThreadGroup tg, String name) {
        super(tg,name);
        this.setPriority(10);
        this.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +"    "+Thread.currentThread().getThreadGroup().getName() +"  "+
                Thread.currentThread().getPriority());
    }
}
