package abhinav.threads;

import java.sql.SQLOutput;

public class ThreadExceP {

    public static void main(String[] args) {


        Priyo t1 = new Priyo();
        t1.setName("t1");
        t1.start();
       Sushatn obj = new Sushatn();
       Thread t2 = new Thread(obj);
       t2.setName("t2");
       t2.start();

    }
}


class Priyo extends  Thread{

    public void run(){
        System.out.println("hello");
        System.out.println(Thread.currentThread().getName());
    }

}

class Sushatn extends Simple implements  Runnable{


    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+"  from susahnt class");
    }
}