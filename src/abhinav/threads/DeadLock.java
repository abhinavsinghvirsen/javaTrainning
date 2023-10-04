package abhinav.threads;

public class DeadLock {
    final static String RESOURCE_1 = "Hello Welcome to iamthatsoftwareguy!";
    final static String RESOURCE_2 = "Visit iamthat software guy!";

    public static void main(String[] args) {

        Thread T1 = new Thread(new DeadLockThread1(RESOURCE_1, RESOURCE_2));


        Thread T2 = new Thread(new DeadLockThread2(RESOURCE_1, RESOURCE_2));


        T1.start();
        T2.start();
    }
}

class DeadLockThread1 implements Runnable {
    private final String resource1;
    private final String resource2;

    public DeadLockThread1(String resource1, String resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {

        synchronized (resource1) {
            System.out.println("Thread T1 locked ->   Resource " + resource1);


            synchronized (resource2) {
                System.out.println("Thread T1 locked -> Resource " + resource2);
            }
        }
    }
}

class DeadLockThread2 implements Runnable {
    private final String resource1;
    private final String resource2;

    public DeadLockThread2(String resource1, String resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {

        synchronized (resource2) {
            System.out.println("Thread T2 locked -> Resource " + resource2);


            synchronized (resource1) {
                System.out.println("Thread T1 locked -> Resource " + resource1);
            }
        }
    }
}
