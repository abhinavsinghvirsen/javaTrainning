package abhinav.threads;

public class MAinTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("hi "+Thread.currentThread().getName());
        JH obj1= new JH();
        obj1.setName("A ");

        MH obj2= new MH();
        obj2.setName("B ");

        KA obj3= new KA();
        obj3.setName("C ");

        obj1.start();
        obj1.join();


        obj2.start();
        obj2.join();
        obj3.start();


        System.out.println("bye "+Thread.currentThread().getName());
    }
}

class JH extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
class MH extends Thread{

    @Override
    public void run() {

        for (int i=0; i<10;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}

class KA extends Thread{

    @Override
    public void run() {

        for (int i=0; i<10;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}