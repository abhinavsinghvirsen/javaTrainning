package abhinav.threads;

public class Simple {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getState());
        for(int i=0;i<=10;i++){
            System.out.println(i);

        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());




    }
}

