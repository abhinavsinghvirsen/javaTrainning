package abhinav.threads.wait;

public class DaemonThread {

    public static void main(String[] args) {
    TN obc= new TN();
    
     obc.start();
        obc.setDaemon(true);
        System.out.println(Thread.currentThread().isDaemon());
    }
}
class TN extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().isDaemon());
    }
}