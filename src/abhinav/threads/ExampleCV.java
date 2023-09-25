package abhinav.threads;

public class ExampleCV {

    public static void main(String[] args) throws InterruptedException {

        Mythread th = new Mythread();

        System.out.println(th.getState() +" first");

        th.start();

        Thread.sleep(1000);

        System.out.println(th.getState() +" second  ") ;



        System.out.println(th.getState() +"third");

    }
}
class Mythread extends Thread{

    public void run(){

        Thread th = Thread.currentThread();
        for (int i=0;i<10;i++){

            System.out.println("name==="  +th.getName() +"state ==="+th.getState()+"   i =="+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}