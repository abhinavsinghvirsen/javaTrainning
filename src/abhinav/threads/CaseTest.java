package abhinav.threads;

public class CaseTest {

    public static void main(String[] args) {

        Bollo h1 = new Bollo();
        Thread t1 = new Thread(h1);
        t1.setName("A");
        Thread t2 = new Thread(h1);
        t2.setName("B");
        t1.start();
        t2.start();


    }
}

class Bollo implements Runnable{

    synchronized void  m1(){
        System.out.println("hello");
    }

    synchronized  void m2(){
        System.out.println("bye");
    }

    @Override
    public void run() {

        this.m1();
        this.m2();

    }
}