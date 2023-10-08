package abhinav.threads;

public class MAinTest {

    public static void main(String[] args) {
        System.out.println("hi "+Thread.currentThread().getName());
        Th obj= new Th();
        obj.setName("thread007");
        obj.start();


        System.out.println("bye "+Thread.currentThread().getName());
    }
}

class Th extends Thread{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+(5/0));
    }
}

