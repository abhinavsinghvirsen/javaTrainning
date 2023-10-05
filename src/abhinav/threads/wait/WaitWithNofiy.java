package abhinav.threads.wait;

import static java.lang.Thread.sleep;

public class WaitWithNofiy {

    public static void main(String[] args) {

        Stack box = new Stack();

        B obj1= new B(box,"B");
        A obj2 = new A(box,"A");


    }
}

class Stack {

    int x;
    boolean flag ;

    public synchronized void push(int val) {

        if (flag) {


            try {
                wait();

            } catch (Exception e) {
                System.out.println(e);

            }

        }

        this.x = val;
        System.out.println("val" + val + "pushed");
        flag = true;
        notify();

    }

    synchronized public int pop() {

        if (!flag) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(x + "pop");

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = false;
        notify();
        return x;

    }

}

    class A implements Runnable{

        Stack sc= null;

        A(Stack obj,String name){

            this.sc=obj;

            Thread t1 = new Thread(this,name);
            t1.start();

        }



        @Override
        public void run() {

            int a=1;
            for (int i=0;i<7;i++){
                sc.push(a++);

            }



        }
    }




class B implements Runnable{

    Stack sc= null;

    B(Stack obj,String name){

        this.sc=obj;

        Thread t2 = new Thread(this,name);
        t2.start();

    }



    @Override
    public void run() {


        for (int i=0;i<7;i++){
            sc.pop();

        }



    }
}



