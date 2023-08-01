public class Lab513 {

    public static void main(String[] args) {

        new Test513().m1();
    }
}

class Demo513 {
     void m1() {
         System.out.println("Demo -> m1()");
    }
}

class Test513 extends Demo513 {

     void m1() {
         System.out.println("Test -> m1()");

     }
}

