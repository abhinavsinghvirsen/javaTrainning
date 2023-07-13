package priyo;

public class Lab358 {

    public static void main(String[] args) {

        Demo358 dd = new Demo358() ;
        dd.setAge(18) ;
        System.out.println(dd.age) ;

    }
}

class Demo358 {

    int age = 18 ;

    void setAge(int age) {

        if(age<18)
           // return 0 ;  Cannot return a value from a method with void result type

         this.age = age ;
    }
}
