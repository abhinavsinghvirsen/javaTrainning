package abhinav.threads;

public class Simple {

    public static void main(String[] args) {


        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());

        Abhinav ab = new Abhinav();
        ab.start();


    }
}


class Abhinav extends Thread{



    @Override
    public void run() {

        System.out.println("hello");

    }
}